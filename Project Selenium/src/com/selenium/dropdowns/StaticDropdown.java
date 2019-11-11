package com.selenium.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws Exception {

		// Static Dropdown : 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("div#divpaxinfo")).click();
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		dropdown.selectByValue("2");
		Thread.sleep(2000);
		dropdown.selectByIndex(5);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("9");
		System.out.println(driver.findElement(By.cssSelector("div#divpaxinfo")).getText());
		
		System.out.println("Code Run Successfully...!!!");
		
		

		
		
	}

}
