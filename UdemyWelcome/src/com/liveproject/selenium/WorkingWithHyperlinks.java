package com.liveproject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHyperlinks {

	public static void main(String[] args) {
		
		// 1. Open the URL
				// https://smartbytes.v-logics.com/ocart/index.php?route=account/register
				String homePage = "https://smartbytes.v-logics.com/ocart/index.php?route=common/home";

				// Register the chrome driver
				System.out.println("Register the Driver...");
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");

				// Create the instance of chrome Driver
				WebDriver driver = new ChromeDriver();

				// Open the URL
				driver.get(homePage);
				
				// We will working with Hyperlink.
				System.out.println("Click on Login Hyperlink");
				driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[1]")).click();
				try {
					Thread.sleep(5000);
				} 
				catch (Exception e)
				{
				}
				System.out.println("Navigate to Registration page");
				driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[2]")).click();
				try {
					Thread.sleep(5000);
				} 
				catch (Exception e)
				{
				}
				System.out.println("Navigate to Shopping Cart Page");
				driver.findElement(By.linkText("Shopping Cart")).click();
				try {
					Thread.sleep(5000);
				} 
				catch (Exception e)
				{
				}
				System.out.println("Navigate to Homepage");
				driver.findElement(By.xpath("//*[@id=\"header\"]/div[5]/a[1]")).click();
				
				// In this example we can access hyperlink with different elements.1) Xpath 2) linkText

	}

}
