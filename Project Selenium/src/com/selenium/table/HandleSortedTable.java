package com.selenium.table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleSortedTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < firstColList.size(); i++) {
			originalList.add(firstColList.get(i).getText());
		}

		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {
			copiedList.add(originalList.get(i));
		}

		// Sort the Table data
		System.out.println("************** Sorted Data *********************************");
		Collections.sort(copiedList); // Sort the data in asc.
		Collections.reverse(copiedList); // Reverse the data n desc.
		for (String sortedData : copiedList) {
			System.out.println(sortedData);
		}

		System.out.println("************** Original Data *********************************");
		for (String originalTableData : originalList) {
			System.out.println(originalTableData);
		}

		// Compare the sorted and original Data.

		 Assert.assertTrue(originalList.equals(copiedList));
	}

}
