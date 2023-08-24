package testcasesreservation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNg {

	WebDriver driver;

	SoftAssert softAssert;

	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// it will open respective url
		driver.get("http://omayo.blogspot.com/");
		softAssert = new SoftAssert();

	}

	@Test
	public void verifyHomePageUrl() {
		softAssert.assertEquals(driver.getCurrentUrl(), "http://omayo.blogspot.com/");

		softAssert.assertFalse(driver.findElement(By.xpath("//a[text()='Page One']")).isEnabled());

		System.out.println("After assertion failure execution will continue");
		
		softAssert.assertFalse(driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());
        
		softAssert.assertAll();
	}

	@Test
	public void verifyHomePageTitle() {
		softAssert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		softAssert.assertAll();
	}

	@AfterMethod
	public void teraDown() {
		driver.quit();
	}

}
