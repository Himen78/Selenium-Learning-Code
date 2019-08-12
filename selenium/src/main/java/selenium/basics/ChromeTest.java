package selenium.basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		String actualUrl= "http://www.google.com";
		String currentUrl ="";
		String title ="";
		System.out.println("Registering driver ");
		//1. Register chrome driver with my java program
		System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys\\Documents\\selenium\\drivers\\chromedriver.exe"); 
		//2. Open google chrome and open a web site www.google.com
		WebDriver driver = new ChromeDriver();
		System.out.println("Opening www.google.com");
		driver.get(actualUrl);
		currentUrl = driver.getCurrentUrl();
		System.out.println("Actual URL = " + actualUrl);
		System.out.println("Current URL = " + currentUrl);
		//validate URL.
		if(!actualUrl.equals(currentUrl)) {
			System.err.println("website is hacked!!!");
		}
		//validate title.
		 title = driver.getTitle();
		 System.out.println("Title ="+ title);
		System.out.println("Done...");
		
	}
}
