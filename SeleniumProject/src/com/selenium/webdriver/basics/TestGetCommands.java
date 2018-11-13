package com.selenium.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {

	WebDriver driver;
	
	public void invokeBrowser()
	{
	try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		getCommands();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public void getCommands() {
		try {
			driver.get("https://www.amazon.in");
			String titleOfThePage = driver.getTitle();
			System.out.println("The tilte of the page is:"+titleOfThePage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The current Url is:"+currentUrl);
			System.out.println("The Current page Source is:"+driver.getPageSource());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	
		TestGetCommands obj = new TestGetCommands();
		obj.invokeBrowser();
		
		

	}

}
