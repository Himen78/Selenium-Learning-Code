package com.selenium.dateselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		// driver.findElement(By.cssSelector("custom_date_pic required picker-first home-date-pick valid")).click();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		
		
	    System.out.println("Test Run Successfully...!!!!");
		
		
		
		
		
		

	}

}
