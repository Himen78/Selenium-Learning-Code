package com.liveproject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDatePicker {

	public static void main(String[] args) {
	
		// 1. Open the URL
				// https://smartbytes.v-logics.com/ocart/index.php?route=account/register
		String url = "http://smartbytes.v-logics.com/ocart/date.html";
		System.out.println("Registering driver...");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Opening URL :" + url);
		driver.get(url);
		//choose date of departure
		//first click on the date text box.
		driver.findElement(By.id("departure_date")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]/a")).click();
		try {
			Thread.sleep(4000);
		}catch(Exception e) {
			
		}
		driver.findElement(By.id("arrival_date")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();
		

	}
	}

