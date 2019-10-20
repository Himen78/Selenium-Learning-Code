package learn.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {

WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// Google to YouTube Script :
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("https://www.youtube.com/");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.className("LC20lb")).click();
		driver.findElement(By.name("search_query")).sendKeys("Edureka");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		
		
		
		
	}

}
