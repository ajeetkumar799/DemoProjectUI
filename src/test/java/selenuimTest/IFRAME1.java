package selenuimTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME1 {

	public static void main(String[] args) throws InterruptedException {

		
		//Step 1
		//WebDriverManager.chromedriver().setup();		
		//Step 
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	//Main page
		
		//To switch focus from main to iframe page
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		boolean Test = driver.findElement(By.id("demo")).isDisplayed();
		
		if(Test == true) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case failed");
		}
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("tryhome")).click();  //
		
		Thread.sleep(5000);
		
		System.out.println("Execution completed");
		
		driver.close();
	}

}
