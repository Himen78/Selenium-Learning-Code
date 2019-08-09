package com.liveproject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithTables {

	public static void main(String[] args) {

		// 1. Open the URL
				// https://smartbytes.v-logics.com/ocart/index.php?route=account/register
				String tableURL = "https://smartbytes.v-logics.com/ocart/table.html";

				// Register the chrome driver
				System.out.println("Register the Driver...");
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");

				// Create the instance of chrome Driver
				WebDriver driver = new ChromeDriver();

				// Open the URL
				driver.get(tableURL);
				
				// Now we are writing the code for fetch Data from the table.
				
				Select selectRowBox = new Select(driver.findElement(By.name("example_length")));
				selectRowBox.selectByValue("25");
				
				WebElement colGetValue = null;
				
				for(int rowIndex = 1;rowIndex <= 11; rowIndex++)
				{
					System.out.println("Rows :"+rowIndex);
					for(int colIndex = 1; colIndex <= 6; colIndex++ )
					{
						colGetValue = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+rowIndex+"]/td["+colIndex+"]"));
						System.out.print(colGetValue.getText()+"\t");
						
					}
					System.out.println("");
				}
					System.out.println("");
}
}
