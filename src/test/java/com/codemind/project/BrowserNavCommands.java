package com.codemind.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.navigate().to("https://www.Zomato.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		       //what is difference between driver.close and driver.quite
		       //driver.close will close current instance of web browser
		driver.close();
		       //driver.quit will close all instance of webdriver session
		driver.quit();
		

	}

}
