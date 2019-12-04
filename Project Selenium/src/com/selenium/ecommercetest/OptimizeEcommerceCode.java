package com.selenium.ecommercetest;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OptimizeEcommerceCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Implicit wait apply for globally in code.
		// Implicit Wait : Wait for n number of second before you throw the exception.
		// Explicit Wait : It is Applicable for Specific locator only instead of globally.
		
		WebDriverWait w = new WebDriverWait(driver, 5); // Explicit method wait for 5 second for Specific Element.

		// Interview Question :

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] ecommerceApp = { "Brocolli", "Cauliflower", "Beetroot" }; // Store the Vegetables in Array.
		neededVeg(driver, ecommerceApp); // Method Call
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))); // Explicit Method
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy"); // For CssSelector, you can use Tagname.classname
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		// Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
	public static void neededVeg(WebDriver driver, String[] ecommerceApp) throws InterruptedException
	{
		int J = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) // Loop for every items on Page
		{
			String[] name = products.get(i).getText().split("-"); // Split the name of Vegetables
			String formattedName = name[0].trim(); // Remove the white space between the text.

			// Check whether name you entered is resent in Arraylist or not.

			List<String> itemNeededList = Arrays.asList(ecommerceApp);

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
