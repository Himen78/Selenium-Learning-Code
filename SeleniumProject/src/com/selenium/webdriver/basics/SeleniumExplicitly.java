package com.selenium.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExplicitly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		
		sendKeys(driver, firstname, 10, "Himen");
		sendKeys(driver, lastname, 20, "Patel");
		WebElement forgotpassword = driver.findElement(By.linkText("Forgotten account?"));
		clickOn(driver, forgotpassword, 10);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		
		
	}

	private static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value) {
		// TODO Auto-generated method stub
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
	    element.sendKeys(value);
		
	}
	
	private static void clickOn(WebDriver driver1, WebElement element, int timeout) {
		// TODO Auto-generated method stub
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
	    element.click();
		
	}

}
