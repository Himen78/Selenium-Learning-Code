package com.selenium.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("div#divpaxinfo")).click();
		
		// Loop - For Increase the Value of Adult by Clicking on "+" icon.
		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
			
		}
		
		
		
	}

}
