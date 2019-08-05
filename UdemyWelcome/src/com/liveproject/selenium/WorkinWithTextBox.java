package com.liveproject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkinWithTextBox {

	public static void main(String[] args) {
		
		
		String expectedTitle = "Register Account";
		String actualTitle = "";

		// 1. Open the URL https://smartbytes.v-logics.com/ocart/index.php?route=account/register
		String URL = "https://smartbytes.v-logics.com/ocart/index.php?route=account/register";

		// Register the chrome driver
		System.out.println("Register the Driver...");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");

		// Create the instance of chrome Driver
		WebDriver driver = new ChromeDriver();

		// Open the URL
		driver.get(URL);
		driver.manage().window().maximize();
		
		// 2. Enter the firstname, lastname, email and Telephone.
		
		actualTitle = driver.getTitle();
		System.out.println("The Actual Title is:"+actualTitle);
		
		// Enter the first name
		System.out.println("Entre the Firstname");
		driver.findElement(By.name("firstname")).sendKeys("Himen");
		
		// Enter the Last name
		System.out.println("Enter the Lastname");
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		
		// Enter the Email 
		System.out.println("Enter the Email Address");
		driver.findElement(By.name("email")).sendKeys("himenpatel2011@gmail.com");
		
		// Enter the Telephone Number
		System.out.println("Enter the Telephone Number");
		driver.findElement(By.name("telephone")).sendKeys("1234567890");
		
		// Enter the Fax Number
		System.out.println("Enter the Fax Number");
		driver.findElement(By.name("fax")).sendKeys("65783838433");
		

	}

}
