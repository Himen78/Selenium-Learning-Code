package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPOMClass {
	
	protected static WebDriver driver = null;

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://smartbytes.v-logics.com/ocart/index.php?route=account/login");
	LoginPagePOM loginPage = new LoginPagePOM(driver);
	loginPage.performLogin("jack2013@gmail.com", "Himen@123");
	
	try {
		Thread.sleep(5000);
	}catch(Exception e){
		e.printStackTrace();
	}
	
	driver.findElement(By.linkText("Logout")).click();

	}

}
