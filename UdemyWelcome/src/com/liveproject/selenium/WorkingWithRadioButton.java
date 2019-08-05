package com.liveproject.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRadioButton {

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

		// We will interact with Radio button.
		System.out.println("Selecting the RadioButton");
		List<WebElement> newsLetter = driver.findElements(By.name("newsletter")); // WebElememt -> used for DOM objects.
		newsLetter.get(0).click();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}

		newsLetter.get(1).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		driver.findElement(By.name("agree")).click();
		
		// Clicking the continue Button
		System.out.println("Now we will clicking the Button");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/input[2]")).click();
	}
	

}
