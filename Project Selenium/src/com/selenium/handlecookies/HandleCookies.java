package com.selenium.handlecookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize the browser window before page get open. 
		driver.manage().deleteAllCookies(); // Delete all the cookies from browser.
		
		driver.get("https://www.google.com");

		System.out.println("Test run successfully...!!");
	}

}
