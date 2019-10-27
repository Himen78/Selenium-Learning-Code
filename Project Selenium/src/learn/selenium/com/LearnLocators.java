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
		/*driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("https://www.youtube.com/");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.className("LC20lb")).click();
		driver.findElement(By.name("search_query")).sendKeys("Edureka");
		driver.findElement(By.id("search-icon-legacy")).click();*/
		
		// Get the Error text in Console : 
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("himenpatel2011@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Himen@78");
		driver.findElement(By.id("Login")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		
		// How to write a script in Xpath/Css Selector :
		
/*		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("https://www.youtube.com/");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//div[@class='g']//div//div//div[@class='rc']//h3[@class='LC20lb'][contains(text(),'YouTube')]")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Edureka");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		*/
		
		
		
	}

}
