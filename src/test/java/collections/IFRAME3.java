package collections;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME3 {

	public static void main(String[] args) {

		// Step 1
		//WebDriverManager.chromedriver().setup();
		// Step
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.findElement(By.xpath("//a[contains(text(),\"Iframe with in an Iframe\")"))
				.click();
		
		
		WebElement Outerframe = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		
		driver.switchTo().frame(Outerframe);

		WebElement First = driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]"));

		String text = First.getText();

		if (text.equals("Nested iFrames")) {

			System.out.println("Correct text");
			
		} else {
			
			System.out.println("Incorrect text");
		}
		
		WebElement innerframe =driver.findElement(By.xpath("/html/body/section/div/div/iframe"));

		driver.switchTo().frame(innerframe);
		
		WebElement Demo = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		////div[@id="Multiple"]//iframe
		Demo.sendKeys("Automation testing");
		
		//driver.switchTo().parentFrame();
	
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

		//WebElement First = driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]"));

		
	}

}
