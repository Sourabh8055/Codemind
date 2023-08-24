package com.codemind.project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		   //it will open respective url
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[@id'selenium143']")).click();
		   //it will return current window/tab handle
		String mainWindowHandle=driver.getWindowHandle();
		  //it will return all window/tabs handles
		Set<String>handles = driver.getWindowHandles();
		
		for(String winhandle:handles)
		{
			if (winhandle.equals("mainWindowHandle"))
			{
				continue;
			}
			else
			{
				driver.switchTo().window(winhandle);
			}	
		}
		
		System.out.println( driver.findElement(By.xpath("//a[contains(@href,'what-is-selenium')])[1]")).getText());
		driver.close();
		driver.switchTo().window(mainWindowHandle);
		driver.findElement(By.cssSelector("input#redio1")).click();
	}

}
