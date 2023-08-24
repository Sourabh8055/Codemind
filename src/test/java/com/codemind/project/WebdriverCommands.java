package com.codemind.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		   //it will open respective url
		driver.get("https://omayo.blogspot.com/");
		   //it is used to get current open page url
		System.out.println("current page url"+ driver.getCurrentUrl());
		   //it is used to get current page title
		System.out.println("current page url"+ driver.getTitle());
		System.out.println("current page source code"+ driver.getPageSource());
		
		
		
	}

}
