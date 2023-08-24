package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class BaseTest {

	WebDriver driver;
	Utility utility;
	
	@BeforeMethod
	public void setup()
	{
		utility=new Utility();
		utility.getDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

	}
	@AfterMethod
	   public void tearDown() {
		driver.quit();
	}
	
}
