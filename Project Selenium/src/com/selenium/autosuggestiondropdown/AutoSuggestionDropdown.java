package com.selenium.autosuggestiondropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BANG");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText(); // Selenium can't identify hidden
																				// elements from browser.

		// So for get the value from dropdown textbox we are using the JavaScript Dom
		// here for hidden value.
		// JavaScript DOM can extract hidden element because selenium can't identify
		// hidden elements from browser.

		// JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);

		int i = 0;
		// Match the value with BANGALORE INTERNATION AIRPORT

		while (!text.equalsIgnoreCase("BANGALORE INTERNATION AIRPORT")) {
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);

			if (i > 10) {
				break;
			}
		}
		if (i > 10) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found");
		}

	}

}
