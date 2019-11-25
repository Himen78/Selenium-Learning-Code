package com.selenium.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpicejetEndtoEndCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) //0.5, 1
		{
			System.out.println("Disabled Date Picker");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select adultDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adultDropdown.selectByValue("5");
		
		Select currencyDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currencyDropdown.selectByValue("AED");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		
		
		

	}

}
