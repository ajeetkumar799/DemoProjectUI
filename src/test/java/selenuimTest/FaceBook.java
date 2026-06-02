package selenuimTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//options.addArguments("--disable-features=InterestFeedContentSuggestions");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.facebook.com/");
		driver.get("https://theiashub.com/upsc/uppsc-pcs-2026-notification/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123345678");
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("password");
//		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
//		driver.findElement(By.xpath(
//				"//div[@class=\"x6s0dn4 x78zum5 x1qughib xh8yej3\"]/ancestor::div[@class=\"x78zum5 xdt5ytf xh8yej3\"]//input[1]"))
//				.sendKeys("Ajeet");
//		driver.findElement(By.xpath("//input[@id=\"_R_1kl2p4jikacppb6amH1_\"]")).sendKeys("SurName");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//// Select Day
//		WebElement day = driver.findElement(By.xpath("//span[normalize-space()='Day']"));
//		js.executeScript("arguments[0].click();", day);
//		List<WebElement> selectedDate = driver
//				.findElements(By.xpath("//div[contains(@class,'x1lliihq x1plvlek xryxfnj x1n2onr6 xyejjp')]"));
//
//		for (WebElement date : selectedDate) {
//			String text = date.getText().trim();
//
//			if (text.equals("20")) {
//				date.click();
//				break;
//			}
//		}
////select Months
//		WebElement month = driver.findElement(By.xpath("//span[text()='Month']"));
//		js.executeScript("arguments[0].click();", month);
//		List<WebElement> selectedMonth = driver.findElements(
//				By.xpath("//div[contains(@class,'html-div xdj266r x14z9mp xat24cr x1lziwak x1qjc9v5 ')]"));
//		for (WebElement months : selectedMonth) {
//			String text2 = months.getText().trim();
//			if (text2.equals("March")) {
//				months.click();
//				break;
//			}
//		}
////Select Years
//		WebElement year = driver.findElement(By.xpath("//span[normalize-space()='Year']"));
//		js.executeScript("arguments[0].click();", year);
//		List<WebElement> years = driver.findElements(
//				By.xpath("//div[contains(@class,'x1lliihq x1plvlek xryxfnj x1n2onr6 xyejjpt x15dsfln x1')]"));
//
//		for (WebElement yearss : years) {
//			String text3 = yearss.getText().trim();
//			if (text3.equals("2026")) {
//				yearss.click();
//				break;
//			}
//		}
//		List<WebElement> frames = driver
//				.findElements(By.xpath("//iframe[@referrerpolicy='no-referrer-when-downgrade']"));
//		for (WebElement f : frames) {
//			driver.switchTo().frame(5);
//
//		}
//		driver.findElement(By.xpath("//i[@class='tawk-icon tawk-icon-x']")).click();
//		// driver.findElement(By.xpath("")).click();
//		driver.switchTo().alert().dismiss();
//		WebElement dropDown = driver.findElement(By.xpath("//a[normalize-space()='Courses']"));
//		dropDown.click();
//		List<WebElement> menus = driver
//				.findElements(By.xpath("https://theiashub.com/upsc/uppsc-pcs-2026-notification/"));
//		for (WebElement webele : menus) {
//			String text = webele.getText().trim();
//			if (text.equals("UPSC CSE Books")) {
//				webele.click();
//			}
//		}
	}

}
