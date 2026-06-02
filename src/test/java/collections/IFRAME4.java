package collections;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME4 {

	public static void main(String[] args) throws InterruptedException {

		// Step 1

		// WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

		driver.switchTo().frame(1);

		String Text = driver.findElement(By.xpath("//h2[contains(text(),'HTML Iframes')]")).getText();

		driver.switchTo().frame(0);

		WebElement T1 = driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]"));

		System.out.println(T1.getText());

		driver.switchTo().parentFrame();

		WebElement T2 = driver.findElement(By.xpath(
				"//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]"));

		System.out.println(T2.getText());

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

		Thread.sleep(5000);

		driver.quit();
	}

}
