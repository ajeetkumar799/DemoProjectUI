package selenuimTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hidden_webElement_Handling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailIdField = driver
				.findElement(By.xpath("(//input[contains(@class,\"x1i10hfl xggy1nq xtpw4lu x\")])[1]"));
		// 1. using javascriptExecutor most common

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", emailIdField);
		
		// 2. Scroll Into View
		js.executeScript("arguments[0].scrollIntoView(true);", emailIdField);
		emailIdField.click();
		
		
		// 3. By displaying the element before performing the action
		js.executeScript("arguments[0].style.display='block';", emailIdField);
		emailIdField.click();
		
		// 4. By using explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement emailIdField1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[contains(@class,\\\"x1i10hfl xggy1nq xtpw4lu x\\\")])[1]")));
		emailIdField1.click();
		
	}

}
