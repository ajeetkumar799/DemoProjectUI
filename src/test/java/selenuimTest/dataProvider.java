package selenuimTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	WebDriver driver;

	@BeforeMethod
	public void lunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// driver.navigate().refresh();
	}

	@Test(dataProvider = "123")
	public void facebookLogin(String s1, String s2, String expectedMessage) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(s1);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(s2);
		// Thread.sleep(5000);
		WebElement loginButton = driver.findElement(By.xpath("//div[@aria-label=\"Log in\"]"));
		loginButton.click();
		// String actualMessage = driver.findElement(By.xpath("//a[text()='Find your
		// account and log in.']")).getText();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		String actualMessage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Find your account and log in.']")))
				.getText();

		Assert.assertTrue(actualMessage.contains(expectedMessage));

	}

	@DataProvider(name = "123")
	public Object[][] testdata() {

		/*
		 * return new Object[][] { { "gshashi2015@gmail.com", "123",
		 * "Find your account and log in." }, { "Rahul", "456",
		 * "Find your account and log in." } };
		 */

		Object[][] data = { { "gshashi2015@gmail.com", "123", "Find your account and log in." },
				{ "Rahul", "456", "Find your account and log in." } };
		return data;
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit(); // ✅ clean state for next iteration
	}

}
