package com.liveproject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMenuItems {

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

		// Now we are hover the mouse on Menu bar...
		Actions action = new Actions(driver);
		WebElement desktopMenuItems = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"));
		WebElement macSubMenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/div/ul/li[2]/a"));

		WebElement laptopsNotebooks = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a"));
		WebElement components = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a"));
		WebElement tabletsMenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a"));
		WebElement softwareMenuButton = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[5]/a"));

		// action.moveToElement(desktopMenuItems).click(macSubMenu).build().perform(); // Code for Click on Submenu Button

		action.moveToElement(desktopMenuItems).build().perform();

		delay();

		action.moveToElement(laptopsNotebooks).build().perform();

		delay();

		action.moveToElement(components).build().perform();

		delay();

		action.moveToElement(tabletsMenu).build().perform();
		
		delay();

		action.moveToElement(softwareMenuButton).build().perform();

	}

	public static void delay()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
