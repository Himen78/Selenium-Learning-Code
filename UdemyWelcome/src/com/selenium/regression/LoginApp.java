package com.selenium.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApp {

	public static void main(String[] args) {

		String URL = "https://smartbytes.v-logics.com/ocart/index.php?route=account/login";

		// Registered the Chrome Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");

		// Create a object for chrome Driver.
		WebDriver driver = new ChromeDriver();

		// Release the Chrome URL
		driver.get(URL);

		// Enter the User name and password.

		driver.findElement(By.name("email")).sendKeys("jack2010@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Himen@78");

		// Now clicking on Login Button

		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/input[3]")).click();

		// Now Clicking on "Edit your account information" link from My Account.

		driver.findElement(By.linkText("Edit your account information")).click();

		// Edit the users Data...

		driver.findElement(By.name("firstname")).clear(); // First we need to clear the text field
		driver.findElement(By.name("firstname")).sendKeys("Jackson");
		driver.findElement(By.name("lastname")).clear(); // First we need to clear the text field
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		driver.findElement(By.name("email")).clear(); // First we need to clear the text field
		driver.findElement(By.name("email")).sendKeys("jack2013@gmail.com");
		driver.findElement(By.name("telephone")).clear(); // First we need to clear the text field
		driver.findElement(By.name("telephone")).sendKeys("2345677899");
		driver.findElement(By.name("fax")).clear(); // First we need to clear the text field
		driver.findElement(By.name("fax")).sendKeys("343434535");

		// Click on Continue button for Update users data.

		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[2]/div[2]/input")).click();

		// Now clicking on "Change your password" link from My Account.

		driver.findElement(By.linkText("Change your password")).click();

		// Update the User Password.

		driver.findElement(By.name("password")).sendKeys("Himen@123");
		driver.findElement(By.name("confirm")).sendKeys("Himen@123");

		// Click on Continue Button for Update the latest Password into DB.

		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[2]/div[2]/input")).click();

		// LogOut from Application

		driver.findElement(By.linkText("Logout")).click();

	}

}
