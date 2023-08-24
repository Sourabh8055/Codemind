package testcasesreservation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertInTestNg {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// it will open respective url
		driver.get("http://omayo.blogspot.com/");
	}

	@Test
	public void verifyHomePageUrl() {
		assertEquals(driver.getCurrentUrl(), "http://omayo.blogspot.com/");

		assertFalse(driver.findElement(By.xpath("//a[text()='Page One']")).isEnabled());

		System.out.println("After assertion failure execution will stop");

		assertFalse(driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());

	}

	@Test
	public void verifyHomePageTitle() {
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");

	}

	@AfterMethod
	public void teraDown() {
		driver.quit();
	}

}
