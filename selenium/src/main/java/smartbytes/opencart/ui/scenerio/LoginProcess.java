package smartbytes.opencart.ui.scenerio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginProcess {
	private static final String BROWSER="chrome";
	private static final String HOME_PAGE="http://smartbytes.v-logics.com/ocart";
	private static WebDriver driver=null;
	public static void main(String[] args) {	
		//Go to Home Page
		if(BROWSER.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
			driver = new ChromeDriver();
		}else if(BROWSER.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/sys/Documents/selenium/drivers/geckodriver");
			driver = new FirefoxDriver();
		}else {
			//IE
		}
		System.out.println("Opening URL :" + HOME_PAGE);
		driver.get(HOME_PAGE);

		//Click on login
		driver.findElement(By.linkText("login")).click();
		//enter user name
		driver.findElement(By.name("email")).sendKeys("jhondoe@smartbytes.com");
		//enter password
		driver.findElement(By.name("password")).sendKeys("pass123");
		//click on login button
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/input[3]")).click();
	}
}
