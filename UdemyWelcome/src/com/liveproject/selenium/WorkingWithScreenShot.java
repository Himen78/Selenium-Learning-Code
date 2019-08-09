package com.liveproject.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithScreenShot {

	public static void main(String[] args) throws IOException {

		// 1. Open the URL
				// https://smartbytes.v-logics.com/ocart/index.php?route=account/register
				String loginURL = "https://smartbytes.v-logics.com/ocart/index.php?route=account/login";

				// Register the chrome driver
				System.out.println("Register the Driver...");
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");

				// Create the instance of chrome Driver
				WebDriver driver = new ChromeDriver();
				driver.get(loginURL);
				
				driver.findElement(By.name("email")).sendKeys("jacksteven@gmail.com");
				driver.findElement(By.name("password")).sendKeys("jack123");
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/input[3]")).click();
				
				// Taking Screenshot for Home Page.
				
				TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
				File homePageScreenshotFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
				FileUtils fileUtils = new FileUtils();
				fileUtils.copyFile(homePageScreenshotFile, new File("C:\\Users\\Himen\\Downloads\\Selenium Related\\Screenshots\\home_page.png"));
				
				
	}

}
