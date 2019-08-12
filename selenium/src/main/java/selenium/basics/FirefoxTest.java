package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		//How to detect operating system.
		String operatingSystem = System.getProperty("os.name").toLowerCase();
		String browser="firefox";
		WebDriver driver =null;
		
		System.out.println("Operating System ="+ operatingSystem);
		if(operatingSystem.contains("mac")) {
			if(browser.equals("chrome")) {
				System.out.println("Loading Mac chrome driver for chrome browser");
				System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
				driver = new ChromeDriver();
			}else {
				System.out.println("Loading Mac gecko driver for fire fox");
				System.setProperty("webdriver.gecko.driver", "/Users/sys/Documents/selenium/drivers/geckodriver");
				driver = new FirefoxDriver();
			}
		}else if(operatingSystem.contains("windows")) {
			if(browser.equals("chrome")) {
				System.out.println("Loading Mac chrome driver for chrome browser");
				System.setProperty("webdriver.chrome.driver", "c:\\Users\\sys\\Documents\\selenium\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}else {
				System.out.println("Loading Windows gecko driver for fire fox");
				System.setProperty("webdriver.gecko.driver", "c:\\Users\\sys\\Documents\\selenium\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			}
		driver.get("http://www.facebook.com");
	}
	
	
	
	
	
	
}
