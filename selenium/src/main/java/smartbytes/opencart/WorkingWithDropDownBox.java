package smartbytes.opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDownBox {
	public static void main(String[] args) {
		// 1.Open the URL
		String url = "http://smartbytes.v-logics.com/ocart/index.php?route=account/register";
		// Register Chrome Driver
		System.out.println("Registering driver...");
		System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
		// create the instance of Chrome driver.
		WebDriver driver = new ChromeDriver();
		// Open the URL
		System.out.println("Opening URL :" + url);
		driver.get(url);
		System.out.println("setting country");
		//I want to interact with drop down boxes on the screen.
		WebElement countryElement = driver.findElement(By.name("country_id"));
		Select countrySelectBox = new Select(countryElement);
		//countrySelectBox.selectByValue("13");
		countrySelectBox.selectByVisibleText("Australia");
		//wait for few seconds before zone is loaded...
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("setting zone");
		WebElement zoneElement = driver.findElement(By.name("zone_id"));
		Select zoneSelectBox = new Select(zoneElement);
		//countrySelectBox.selectByValue("13");
		zoneSelectBox.selectByVisibleText("New South Wales");
		System.out.println("Done..");
		
		
		
	}
}
