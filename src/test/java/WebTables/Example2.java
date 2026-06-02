package WebTables;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {

	//WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	
	//	driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		int Row2 =driver.findElements(By.xpath("//tbody[@style=\"box-sizing:inherit\"]/tr")).size();
		
		int Col2 =driver.findElements(By.xpath("//tbody[@style=\"box-sizing:inherit\"]/tr/th")).size();
		for (int i = 2; i <= Row2; i++) { // outer for

			for (int j = 1; j <= Col2; j++) { // inner for loop

//				String data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
//				String data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();

				String data = driver
						.findElement(By.xpath("//tbody[@style=\"box-sizing:inherit\"]//tr[" + i + "]//td[" + j + "]"))
						.getText();

				System.out.println(data);
				
				if(data.equals("Canada")) {
					
					System.out.println(""+i+":"+j);
				}
				
			}

			System.out.println();

		}
		driver.close();
	}

}
