package com.selenium.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected()); // Xpath Regular Expression
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // Css Selector Regular Expression
		
		// How to count the number of check boxes in Application.
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
