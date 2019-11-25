package com.selenium.ecommercetest;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEcommerceApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		int J = 0;

		// Interview Question :

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] ecommerceApp = { "Brocolli", "Cauliflower", "Beetroot" }; // Store the Vegetables in Array.

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) // Loop for every items on Page
		{
			String[] name = products.get(i).getText().split("-"); // Split the name of Vegetables
			String formattedName = name[0].trim(); // Remove the white space between the text.

			// Check whether name you entered is resent in Arraylist or not.

			List itemNeededList = Arrays.asList(ecommerceApp);

			if (itemNeededList.contains(formattedName)) {
				J++;

				// No click on Add to Cart Page.

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				Thread.sleep(2000);

				if (J == ecommerceApp.length) {
					break;
				}
			}
		}

	}

}
