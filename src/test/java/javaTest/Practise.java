package javaTest;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise extends Test12345 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.moneycontrol.com/stocksmarketsindia/");
		driver.navigate().to("https://www.moneycontrol.com/stocksmarketsindia/");
		List<WebElement> row = driver.findElements(By.xpath("(//table[@class='mctable1'])[1]//tr"));
		for (int r = 4; r <= row.size(); r++) {
			System.out.println("row=" + row.size());
			List<WebElement> col = driver.findElements(By.xpath("(//table[@class='mctable1'])[1]//tr[" + r + "]//td"));
			for (int c = 1; c <= col.size(); c++) {
				System.out.println("Cell=" + col.size());
				if (c == 2 && r == 4) {
					WebElement tdValue = driver
							.findElement(By.xpath("(//table[@class='mctable1'])[1]//tr[" + r + "]//td[" + c + "]"));
					String cell = tdValue.getText();
					System.out.println(cell);
				}
//				if (cell.equals("774.10")) {
//
//					String s = tdValue.getText();
//					System.out.println("table data=" + s);

			}
		}

	}
}
