package com.selenium.autosuggestiondropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("uni");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // For handle hidden value
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
		int i = 0;
		
		while(!text.equalsIgnoreCase("United Kingdom (UK)"))
		{
			i++;
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			
			if(i>10)
			{
				break;
			}
			
		}
		if(i>10)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found");
		}
		
		
	}

}
