package smartbytes.opencart.pom.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import smartbytes.opencart.pom.RegistrationPage;

public class TestRegistrationPage {
protected static WebDriver driver=null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://smartbytes.v-logics.com/ocart/index.php?route=account/register");
		RegistrationPage regPage = new RegistrationPage(driver);
		regPage.register("Jhon", "Doe", "jhondoe@smartbytes.com", "112345", "Jhon address", "Sydney", "1234",
				"Australia", "New South Wales", "secret");
		
	}
}
