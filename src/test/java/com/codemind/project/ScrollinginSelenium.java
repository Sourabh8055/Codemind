package com.codemind.project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollinginSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		   //it will open respective url
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,500)", "");
		javascriptExecutor.executeScript("window.scrollBy(0,-250)", "");
		
		
	}

}
