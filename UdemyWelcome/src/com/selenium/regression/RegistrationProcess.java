package com.selenium.regression;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationProcess {

	private static final String BROWSER = "chrome";
	private static final String HOME_PAGE = "https://smartbytes.v-logics.com/ocart";
	private static WebDriver driver = null;

	public static void main(String[] args) {

		// Choose Browser

		if (BROWSER.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.geco.driver",
					"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		System.out.println("Opening URL:" + HOME_PAGE);
		driver.get(HOME_PAGE);
		driver.manage().window().maximize();

		// Click on Create new Account Link
		driver.findElement(By.linkText("create an account")).click();

		// Enter the Personal details

		personalDetails();

		// Enter Address Details

		addressDetails();

		// Enter Password and Confirm Password

		driver.findElement(By.name("password")).sendKeys("Himen@78");
		driver.findElement(By.name("confirm")).sendKeys("Himen@78");

		// Newsletter By default Yes :

		List<WebElement> newsLetter = driver.findElements(By.name("newsletter")); // WebElememt -> used for DOM objects.
		newsLetter.get(0).click();

		// Agree Hyper link

		driver.findElement(By.name("agree")).click();

		// Clicking the continue Button
		System.out.println("Now we will clicking the Button");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/input[2]")).click();
		
		// No we will log out Account.
		System.out.println("Log-out Successfully.....");
		driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[2]")).click();
		
		
		
	}
	
	/**
	 * This method is used to fill up the Personal details.
	 * @param Firstname
	 * @param lastname
	 * @param email
	 * @param Telephone
	 * @param fax
	 * 
	 */
	
	public static void personalDetails()
	{
		driver.findElement(By.name("firstname")).sendKeys("Steve");
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		driver.findElement(By.name("email")).sendKeys("jack2011@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("487837479472");
		driver.findElement(By.name("fax")).sendKeys("323434324242");
	}
	
	/**
	 * This method is used to fill up the address details.
	 * @param Company
	 * @param Company ID
	 * @param Address 1
	 * @param Address 2
	 * @param City
	 * @param Postcode
	 * 
	 */
	public static void addressDetails() {
		
		driver.findElement(By.name("company")).sendKeys("FLYAir India");
		driver.findElement(By.name("company_id")).sendKeys("414");
		driver.findElement(By.name("address_1")).sendKeys("Manjalpur");
		driver.findElement(By.name("address_2")).sendKeys("Vadodara");
		driver.findElement(By.name("city")).sendKeys("Vadodara");
		driver.findElement(By.name("postcode")).sendKeys("32343");

		WebElement countryElement = driver.findElement(By.name("country_id")); // First of all need to select web
																				// element
		Select countrySelectionBox = new Select(countryElement);
		// countrySelectionBox.selectByValue("13");
		countrySelectionBox.selectByVisibleText("Australia");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Hold for 5 Sec

		System.out.println("Choose value from State"); // First of all need to select web element
		WebElement zoneElement = driver.findElement(By.name("zone_id"));
		Select zoneSelectionBox = new Select(zoneElement);
		zoneSelectionBox.selectByVisibleText("New South Wales");
		
	}

}
