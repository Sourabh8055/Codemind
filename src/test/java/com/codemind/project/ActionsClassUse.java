package com.codemind.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassUse {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		Actions actions = new Actions(driver);

		WebElement blogs = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		// actions.moveToElement(blogs).build().perform();

		WebElement textarea = driver.findElement(By.xpath("//textarea[@id='ta1']"));

		WebElement textarea2 = driver.findElement(By.xpath("//textarea[@cols='30']"));

		actions.sendKeys(textarea, "Test").keyDown(textarea, Keys.CONTROL).keyDown(textarea, "a").keyUp("a")
				.keyDown(textarea, "c").keyUp("c").keyDown(textarea2, "v").keyUp("v").build().perform();

		// actions.keyDown(textarea, Keys.SHIFT).keyDown(textarea,
		// "a").keyUp(Keys.SHIFT).keyUp("a").build().perform();

		actions.contextClick(textarea).build().perform();

	}

}
