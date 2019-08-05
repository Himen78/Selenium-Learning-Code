package com.liveproject.selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropdownBox {

public static void main(String[] args) {
	

		// 1. Open the URL
		// https://smartbytes.v-logics.com/ocart/index.php?route=account/register
		String URL = "https://smartbytes.v-logics.com/ocart/index.php?route=account/register";

		// Register the chrome driver
		System.out.println("Register the Driver...");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");

		// Create the instance of chrome Driver
		WebDriver driver = new ChromeDriver();

		// Open the URL
		driver.get(URL);
		
		// I want to interact with Drop-down box.
		System.out.println("Choose value from conutry dropdown");
		WebElement countryElement = driver.findElement(By.name("country_id"));
		Select countrySelectionBox = new Select(countryElement);
		// countrySelectionBox.selectByValue("13");
		countrySelectionBox.selectByVisibleText("Australia");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Wait for 5 Second
		
		System.out.println("Choose value from State");
		WebElement zoneElement = driver.findElement(By.name("zone_id"));
		Select zoneSelectionBox = new Select(zoneElement);
		zoneSelectionBox.selectByVisibleText("New South Wales");
			

	}

}
