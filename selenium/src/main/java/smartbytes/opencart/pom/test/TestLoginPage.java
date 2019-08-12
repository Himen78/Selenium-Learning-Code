package smartbytes.opencart.pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import smartbytes.opencart.pom.LoginPage;

public class TestLoginPage {
	protected static WebDriver driver=null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://smartbytes.v-logics.com/ocart/index.php?route=account/login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.performLogin("jhondoe@smartbytes.com", "pass123");
		try {
			Thread.sleep(4000);
		}catch(Exception e) {
			
		}
		driver.findElement(By.linkText("Logout")).click();
	}
}
