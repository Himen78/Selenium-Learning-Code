package com.selenium.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseElementLocatorTechniques {

	WebDriver driver;

	public void invokeBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); // For Maximize Screen
			driver.manage().deleteAllCookies(); // For Delete All Cookies
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // wait for 30 Second.
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Wait for 40 second for Page Loading.
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void elementLocatorTechniquesUsingAmazon() {
		try {
			invokeBrowser("https://www.amazon.in");
			driver.findElement(By.linkText("Your Amazon.in")).click();
			driver.navigate().back();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 6T");
			driver.findElement(By.className("nav-input")).click();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("Customer")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void elementLocatorTechniqueUsingFacebook()
	{
		try {
			invokeBrowser("https://www.facebook.com");
			driver.findElement(By.name("firstname")).sendKeys("Himen");
			//driver.findElement(By.name("lastname")).sendKeys("Patel");
			//driver.findElement(By.name("reg_email__")).sendKeys("himenpatel2011@gmail.com");
			// Change Code
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
			
			
			
			//driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		UseElementLocatorTechniques obj = new UseElementLocatorTechniques();
		//obj.elementLocatorTechniquesUsingAmazon();
		obj.elementLocatorTechniqueUsingFacebook();
		

	}

}
