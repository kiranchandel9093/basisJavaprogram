package extent_report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class A {
	ExtentReports extentreports;
	ExtentTest test;
	String path = "C:\\Users\\NECTAR\\eclipse-workspace\\Java Programs\\src\\extent_report\\";
	WebDriver driver;
	@BeforeTest
	void Open_browser()
	{
		extentreports = new ExtentReports(path + "first_test.html");
		test = extentreports.startTest("Test 1");
		driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}

	@Test
	void Verifypage()
	{
		if(driver.getTitle().equals("Google"))
		{
		test.log(LogStatus.PASS, "Test case Pass");
		}
		else
		{
		test.log(LogStatus.FAIL, "Test Failed");
		}
		}
		@AfterTest
	 void endTest()
		{
			extentreports.endTest(test);
			extentreports.flush();
		}

}
