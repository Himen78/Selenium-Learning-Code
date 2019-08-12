package smartbytes.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class GoogleHomePageTest extends TestCase{
	
	
	public void test_google_homgepage_url_and_title() {
	//open url
	//read title and validate it.
		String actualUrl= "https://www.google.co.in/?gws_rd=ssl";
		String currentUrl ="";
		String title ="";
		System.out.println("Registering driver ");
		//1. Register chrome driver with my java program
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\Documents\\selenium\\drivers\\chromedriver.exe"); 
		//2. Open google chrome and open a web site www.google.com
		WebDriver driver = new ChromeDriver();
		System.out.println("Opening www.google.com");
		driver.get(actualUrl);
		currentUrl = driver.getCurrentUrl();
		
		//validate title
		title = driver.getTitle();
		assertEquals("Google", title);
		//validate url.
		assertEquals(actualUrl, currentUrl);
		driver.quit();
	}

}
