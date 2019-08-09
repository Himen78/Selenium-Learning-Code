package com.liveproject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WokingWithTablePartSecond {

	public static void main(String[] args) {

		// 1. Open the URL
		// https://smartbytes.v-logics.com/ocart/index.php?route=account/register
		String tableURL = "https://smartbytes.v-logics.com/ocart/table.html";

		// Register the chrome driver
		System.out.println("Register the Driver...");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");

		// Create the instance of chrome Driver
		WebDriver driver = new ChromeDriver();

		// Open the URL
		driver.get(tableURL);
		
		// I want to search for employees who lives in london.
		driver.findElement(By.cssSelector("#example_filter > label > input[type=search]")).sendKeys("London");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// I want to sort data by Employee age.
		driver.findElement(By.xpath("//*[@id=\"example\"]/thead/tr/th[4]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// I want to navigate to second page from the main page.
			driver.findElement(By.xpath("//*[@id=\"example_paginate\"]/span/a[2]")).click();
		
	}

}
