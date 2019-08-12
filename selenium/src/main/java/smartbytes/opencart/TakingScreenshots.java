package smartbytes.opencart;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshots {

	public static void main(String[] args) {
		FileUtils fileUtils = new FileUtils();

		String loginPageUrl = "http://smartbytes.v-logics.com/ocart/index.php?route=account/login";
		System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		System.out.println("Opening Login Page" + loginPageUrl);
		driver.get(loginPageUrl);

		//Perform Login
		driver.findElement(By.name("email")).sendKeys("jhondoe@smartbytes.com");
		driver.findElement(By.name("password")).sendKeys("pass123");
		
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		System.out.println("Taking screenshot for login page");
		File loginPageScreenshotFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		try {
			fileUtils.copyFile(loginPageScreenshotFile, new File("/Users/sys/Documents/selenium/screenshots/login_page.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Login page screen shot taken..");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/input[3]")).click();
		//Take screenshot of home page.
		 takeScreenShot = (TakesScreenshot) driver;
		System.out.println("Taking screenshot for home page");
		File homePageScreenshotFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		try {
			fileUtils.copyFile(homePageScreenshotFile, new File("/Users/sys/Documents/selenium/screenshots/home_page.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot for home page saved...");
		
	}
}
