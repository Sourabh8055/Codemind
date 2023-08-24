package com.codemind.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleFrameElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		   //it will open respective url
		driver.get("https://omayo.blogspot.com/");
		WebElement frame= driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		driver.switchTo().frame(frame);
		System.out.println(driver.findElement(By.xpath("//a[@id='b-getorpost'])")).getText());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@title'search'and @name'q']")).sendKeys("Hello");
		

	}

}
