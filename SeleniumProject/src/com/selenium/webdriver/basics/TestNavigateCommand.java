package com.selenium.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigateCommand {

	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); // For Maximize Screen
			driver.manage().deleteAllCookies(); // For Delete All Cookies
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // wait for 30 Second.
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Wait for 40 second for Page Loading. 
			navigateCommand();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateCommand()
	{
		try {
			driver.navigate().to("https://www.flipkart.com");
			driver.findElement(By.linkText("Advertise")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		TestNavigateCommand obj = new TestNavigateCommand();
		obj.invokeBrowser();
	}

}
