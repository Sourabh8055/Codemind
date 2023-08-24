package com.codemind.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragNDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		   //it will open respective url
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='colomn-a']"));
		WebElement dese=driver.findElement(By.xpath("//div[@id='colomn-b']"));
		
		
		     //action.clickAndHold(source).pause(1000).moveToElement(dese).pause(1000).release().build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(dese, source).build().perform();
	}

}
