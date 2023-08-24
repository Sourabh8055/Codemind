package testcasesreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelTestExecution {
	
	WebDriver driver;

	
	@Test
	public void Test_1() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// it will open respective url
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	
	@Test
	public void Test_2() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// it will open respective url
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	
	@Test
	public void Test_3() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// it will open respective url
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}

}

