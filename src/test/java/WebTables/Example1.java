package WebTables;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {

		// WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

		WebElement Test = driver.findElement(By.xpath("(//h3[contains(text(),'Example')])[2]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", Test);

		// 1.How many rows in table

		List<WebElement> Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr"));

		System.out.println("Total no of row -->" + Row1.size());

		int Row2 = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr")).size();
		System.out.println("Total no of row -->" + Row2);

		// 2. How many column in a table

		List<WebElement> Col1 = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr//th"));

		System.out.println("Total no of Col -->" + Col1.size());

		int Col2 = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr//th")).size();

//		int Row2 =driver.findElements(By.xpath("//tbody[@style=\"box-sizing:inherit\"]/tr")).size();
//		
//		int Col2 =driver.findElements(By.xpath("//tbody[@style=\"box-sizing:inherit\"]/tr/th")).size();
		System.out.println("Total no of Col -->" + Col1.size());

		// 3. Retrieve the specific row/col data
		String Text = driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr[4]/td[3]")).getText();

		System.out.println(Text);

		// 4. Retrieve all the data from the table

		for (int i = 2; i <= Row2; i++) { // outer for

			for (int j = 1; j <= Col2; j++) { // inner for loop

				String data = driver
						.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();

//				String data=driver.findElement(By.xpath("//tbody[@style=\"box-sizing:inherit\"]//tr["+i+"]//td["+j+"]")).getText();

				System.out.print(data + " | ");
			}

			System.out.println();

		}
		driver.close();
	}
}
