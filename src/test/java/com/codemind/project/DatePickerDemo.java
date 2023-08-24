package com.codemind.project;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

import utilities.Utility;

public class DatePickerDemo {

	private static final String JavascriptExecutor = null;
	public static void main(String[] args)throws IOException{
		
		DatePickerDemo d=new DatePickerDemo();
		d.selectDate("2024", "April", "10");
		
	}
    public void selectDate(String year,String month,String date)throws IOException
    
    {
    	System.setProperty("webdriver.chrome.driver" ,Utility.readProprety("newtourur1"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		((JavascriptExecutor)driver).executeScript("argument[0].click(),");
		//driver.findElement(By.xpath("//input[@id='dateOfBirthInput]")).click();
		
		Select select= new Select(driver.findElement(By.xpath("//select[@class='.react-datepicker__year-select']")));
		select.selectByVisibleText("2024");
		
		Select select= new Select(driver.findElement(By.xpath("//select[@class='.react-datepicker__month-select']")));
		select.selectByVisibleText("April");
		WebElement dates=driver
				.findElement(By.xpath("//dic[@class='react-datepicker__month']//div[@role='option']"));
		
		for(WebElement day : dates)
		    {
			if(day.getText().equals(date)){
				day.click();
			}
			
		}
    }
}
