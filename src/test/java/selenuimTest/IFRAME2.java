package selenuimTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME2 {

	public static void main(String[] args) {

		// Step 1
		//WebDriverManager.chromedriver().setup();
		// Step
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame("SingleFrame");
		
		// NoSuchFrameException
		
		WebElement Demo = driver.findElement(By.xpath("//input[@type=\"text\"]"));

		Demo.sendKeys("Automation Testing");

		// If we use driver.switchTo.defaultContent() then it will be
		//navigate from any child to main page.
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		// driver.close();
		
		driver.switchTo().parentFrame();
		
		
	}

}
