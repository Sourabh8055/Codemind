package com.codemind.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		   //it will open respective url
		driver.get("https://omayo.blogspot.com/");
		
		WebElement MaleRadioButton = driver.findElement(By.xpath("//input[@id='radio1']]"));
		WebElement FemaleRadioButton = driver.findElement(By.xpath("//input[@id='radio2']]"));
		WebElement orangeCheckBox = driver.findElement(By.xpath("//input[@id='radio1']]"));
		WebElement blueCheckBox = driver.findElement(By.xpath("//input[@id='radio2']]"));
		
		MaleRadioButton.click();
		
		System.out.println("Male radio button" +MaleRadioButton.isSelected());
		System.out.println("Female radio button" +FemaleRadioButton.isSelected());
		System.out.println("Orange CheckBox" +orangeCheckBox.isSelected());
		System.out.println("Blue CheckBox" +blueCheckBox.isSelected());
		
		
		
		
	}

}
