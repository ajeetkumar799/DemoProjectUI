package WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3 {
	static WebDriver driver;

	// Method to get due amount dynamically by last name

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/tables");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println("Number of rows = " + rows.size());

		for (int r = 1; r <= rows.size(); r++) {
			// get all cells in the current row
			List<WebElement> cells = driver.findElements(By.xpath("//table[@id='table1']//tr[" + r + "]//td"));
			for (int c = 1; c <= cells.size(); c++) {
				WebElement cell = driver.findElement(By.xpath("//table[@id='table1']//tr[" + r + "]//td[" + c + "]"));
				String value = cell.getText();
				// System.out.print(value + " | "); // print each cell value
				if (value.contains("http://www.frank.com")) {
					System.out.println(value);

				}
			}
		}

	}
}
