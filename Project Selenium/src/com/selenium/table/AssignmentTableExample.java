package com.selenium.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTableExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.xpath("//table[@name='courses']"));
		int rowCount = table.findElements(By.xpath("//div[@class='block large-row-spacer']//tr")).size();
		System.out.println(rowCount);
		
		int colCount = table.findElements(By.xpath("//div[@class='block large-row-spacer']//tr/th")).size();
		System.out.println(colCount);
		
		String getRowDetails = table.findElement(By.xpath("//div[@class='block large-row-spacer']//tr[3]")).getText();
		System.out.println(getRowDetails);
		
}
}
