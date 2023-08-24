package com.codemind.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class WebElementCommands {


	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement SearchTextFild = driver.findElement(By.xpath("//input[@title='Search'and @name='q']"));
		
		        //sendkey method is used to send key on textfields/textboxes
		
		SearchTextFild.sendKeys("Testing");
		
		Thread.sleep(2000);
		
		       //sendkeys method is used to clear textfields/textboxes
		SearchTextFild.clear();
		
		Point p= SearchTextFild.getLocation();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Dimension d= SearchTextFild.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		File file=SearchTextFild.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file,new File("src/test/resources/screenshot/snap1.png"));
		
		
		
//		WebElement onepage = driver.findElement(By.xpath("//h3[@itempro = 'name']//a"));
//		   
//		       //it is used to get html tag of element
//		System.out.println("It return html teg of webelement=" + onepage.getTagName());
//		
//		       //it will return Webelement text
//		System.out.println("It return text of webelement=" + onepage.getText());
//		
//		       //it is used to get attribute of webelement 
//		System.out.println("It return given attribute value"+ onepage.getAttribute("href"));
//		
//		onepage.click();
//		

	}

}
