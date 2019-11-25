package com.selenium.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		// Assignment Start
		
		//Select a Date from Date Picker
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		// Select Value from dropdown
		
		Select dropdown = new Select(driver.findElement(By.id("Adults")));
		dropdown.selectByValue("5");
		
		Select dropdownnext = new Select(driver.findElement(By.id("Childrens")));
		dropdownnext.selectByVisibleText("3");
		
		Select dropdownInfants = new Select(driver.findElement(By.id("Infants")));
		dropdownInfants.selectByIndex(1);
		
		// Select Hyperlink
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		Select ClassOfTravel = new Select(driver.findElement(By.id("Class")));
		ClassOfTravel.selectByVisibleText("Business");
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		
		driver.findElement(By.id("SearchBtn")).click();
		
    	System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		System.out.println("Test Run Successfully..!!!!");
		
		
	}

}
