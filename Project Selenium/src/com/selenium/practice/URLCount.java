package com.selenium.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size()); // 1. Count the total URL on page

		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // Limiting webdriver scope

		System.out.println(footerdriver.findElements(By.tagName("a")).size()); // Count the total URL on Page footer.

		WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr//td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size()); // Count the total URL on particular
																				// section

		// Click on each link in the column and check if the page are opening

		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {

			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) // hashNext is checked whether the next element is presented OR not.
		{
			driver.switchTo().window(it.next()); // Switch to the next element.
			System.out.println(driver.getTitle());
		}

	}

}
