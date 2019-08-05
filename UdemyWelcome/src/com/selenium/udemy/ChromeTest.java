package com.selenium.udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		
		
		// Register Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		// Open the Goole.com
		WebDriver driver = new ChromeDriver();
		
		// Open the URL
		driver.get("https://www.udemy.com");
		// Maximize the tab window
		driver.manage().window().maximize();
		
	}
	
}
