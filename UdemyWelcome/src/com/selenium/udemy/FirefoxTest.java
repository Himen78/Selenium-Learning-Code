package com.selenium.udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		System.out.println("Opening web page");
		
		// Open URL
		driver.get("http://www.facebook.com");
		
		String title = driver.getTitle();
		System.out.println("Title :"+ title);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("URL:"+ currentURL);
		
		// assert title and URL.
		String expectedTitle = "Facebook - log in or Sign up";
		
		if(expectedTitle.equals(title))
		{
			System.out.println("Title Matched");
		}else {
			System.out.println(" Title is not correct");
		}
		
	}

}
