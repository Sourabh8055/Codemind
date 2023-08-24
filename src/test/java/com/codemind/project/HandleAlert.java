package com.codemind.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		   //it will open respective url
		driver.get("https://omayo.blogspot.com/");
		WebElement button=driver.findElement(By.xpath("//input[@id='confirm']"));
		button.click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		    //al.accept();
		driver.findElement(By.xpath("//input[@id'redio1']")).click();
		
		
	}

}
