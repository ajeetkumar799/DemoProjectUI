package selenuimTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey_Alternates {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailIdField = driver
				.findElement(By.xpath("(//input[contains(@class,\"x1i10hfl xggy1nq xtpw4lu x\")])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].value='ajeet123';", emailIdField);

		// 2.Direct Element Attribute Manipulation
		/*
		 * js.executeScript("arguments[0].setAttribute('value','ajeet123')",emailIdField
		 * );
		 */
		// 3.Fire input events manually with JavaScript
		/*
		 * js.executeScript( "arguments[0].setAttribute('value','ajeet123');" +
		 * "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
		 * emailIdField );
		 */

		// 4.Clipboard + Paste (Robot Class)
		// Click to focus the field
		emailIdField.click();
		// Copy text into clipboard
		String text = "ajeet123";
		StringSelection selection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);// null for no owernship

		System.out.println("Text copied to clipboard: " + text);
	    // Paste using Robot (Ctrl+V)
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); // Press Control key
		robot.keyPress(KeyEvent.VK_V);//Press V
		robot.keyRelease(KeyEvent.VK_V);// Releases the V key.
		robot.keyRelease(KeyEvent.VK_CONTROL);// Releases the Control key.
		// At this point, the full Ctrl+V combination has been executed.

	}

}
