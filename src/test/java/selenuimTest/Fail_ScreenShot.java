package selenuimTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Fail_ScreenShot {
	String testCaseID;

	@Test(description = "TC001 - Verify Google Page")
	public void test1() {
		System.out.println("Failed");
		Assert.fail("Forcing failure to test screenshot");
	}

	@Test(description = "TC003 - Verify Google Page")
	public void test3() {
		System.out.println("Failed");
		Assert.fail("Forcing failure to test screenshot");
	}

	@Test(description = "TC004 - Verify Google Page")
	public void test4() {
		System.out.println("Failed");
		Assert.fail("Forcing failure to test screenshot");
	}

	@Test(description = "TC005 - Verify Google Page")
	public void test5() {
		System.out.println("Failed");
		Assert.fail("Forcing failure to test screenshot");
	}

	@Test(description = "TC002 - Verify Bing Page")
	public void test2() {
		System.out.println("Passed");
	}

	@AfterMethod
	public void captureScreenshot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String testCaseID = result.getMethod().getDescription(); // Use description as ID
			TakesScreenshot ts = (TakesScreenshot) new ChromeDriver();
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\SelenuimScreenshots\\" + testCaseID + ".png");
			FileUtils.copyFile(src, dest);
			System.out.println("Screenshot saved for failed test: " + testCaseID);
		}
	}

}
