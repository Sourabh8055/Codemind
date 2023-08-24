package com.codemind.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStateries {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		   //findElement Method is Used to single used
		   //findElement Method anable to find Specified 
		   //web element it will return NosuchElement Exception 
		WebElement title= driver.findElement(By.name("Header"));
		System.out.println(title.getText());
		
	    //WebElement title2=driver.findElement(By.id("header"));
	    //System.out.println(title2.getText());
		
		//WebElement title3=driver.findElement(By.className("header section"));
		//System.out.println(title3.getText());
		
		//WebElement h3=driver.findElement(By.tagName("h3"));
		//System.out.println(h3.getText());
		
	    driver.findElement(By.linkText("onlytestingblog")).click();
	    
	    driver.findElement(By.partialLinkText("Stingblog")).click();
	    
		
		
		
	}

}
