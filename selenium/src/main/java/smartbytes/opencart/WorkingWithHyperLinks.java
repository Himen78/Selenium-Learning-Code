package smartbytes.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHyperLinks {
	public static void main(String[] args) {
		String homePage="http://smartbytes.v-logics.com/ocart/index.php?route=common/home";
		System.out.println("Registering driver...");
		System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
		// create the instance of chrome driver.
		WebDriver driver = new ChromeDriver();
		// Open the URL
		System.out.println("Opening Home Page :" + homePage);
		driver.get(homePage);
		driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[1]")).click();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		driver.findElement(By.xpath("//*[@id=\"welcome\"]/a[2]")).click();
	}
}
