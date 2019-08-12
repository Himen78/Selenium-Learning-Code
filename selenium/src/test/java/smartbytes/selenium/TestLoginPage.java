package smartbytes.selenium;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

public class TestLoginPage extends TestCase {
	private static final String BROWSER = "chrome";
	private static final String HOME_PAGE = "http://smartbytes.v-logics.com/ocart";
	private static WebDriver driver = null;
	private static final Logger logger = LogManager.getLogger(TestLoginPage.class);
	
	public void test_login() {


		// Go to Home Page
		if (BROWSER.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			// IE
		}
		logger.info("Opening URL :" + HOME_PAGE);
		driver.get(HOME_PAGE);

		logger.info("Click on login link");
		
		driver.findElement(By.linkText("login")).click();
		logger.info("entering user name");
		driver.findElement(By.name("email")).sendKeys("jhondoe@smartbytes.com");
		logger.info("entring password");
		driver.findElement(By.name("password")).sendKeys("pass123");
		logger.info("clicking on login button");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/input[3]")).click();

		// validate title of account page.
		String title = driver.getTitle();
		logger.info("validating title ");
		assertEquals("My Account", title);

		driver.quit();

	}
}
