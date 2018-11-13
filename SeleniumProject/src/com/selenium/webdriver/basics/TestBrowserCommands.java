package com.selenium.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowserCommands {

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
				driver.get("https://www.yatra.com");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void closeBrowser()
		{
			try {
				Thread.sleep(3000);
				driver.close();
				//driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		public static void main(String[] args)
		{
			TestBrowserCommands obj = new TestBrowserCommands();
			obj.invokeBrowser();
			obj.closeBrowser();
		}

}