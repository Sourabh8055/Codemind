package testcasesreservation;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// it will open respective url
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}

	@Test(dataProvider = "userData")
	public void verifyLogin(String userName, String password) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

		driver.findElement(By.xpath("//input[@name='submit']")).click();

		assertTrue(driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText()
				.equals("Login Successfully"));

	}

	@DataProvider(name = "userData")
	public String[][] dataProvider() {
		String users[][] = { { "admin", "admin1" }, { "user1", "pass1" }, { "user2", "password2" } };
		return users;
	}

	@AfterMethod
	public void teraDown() {
		driver.quit();
	}
}
