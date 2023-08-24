package com.codemind.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//to open naukri web page
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.linkedin.com/");
		driver.switchTo().newWindow(WindowType.TAB).get("https://in.indeed.com/");
		driver.close();//It will Close Linkedin
		driver.quit();//It will Close all window & Tab
		

	}

}
