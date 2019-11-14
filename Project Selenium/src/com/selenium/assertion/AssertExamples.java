package com.selenium.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		// System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected()); // Xpath Regular Expression
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // Css Selector Regular Expression
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// How to count the number of check boxes in Application.
		
		Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).getTagName(), "div");
		System.out.println("Test Passed Successfully..");
		System.out.println("Check Box Size is: "+ driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		

	}

}
