package com.codemind.project;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class ExcelDriveTestCase {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", Utility.readProperty("driverPath"));

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(Utility.readProperty("newtoururl"));

		List<String> data = Utility.readExcelFile();

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(data.get(0));

		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(data.get(1));

		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(data.get(2));

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(data.get(3));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//input[@name='submit']")));

		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

}
