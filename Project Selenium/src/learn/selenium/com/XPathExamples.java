package learn.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExamples {

	public static void main(String[] args) {
		
		WebDriver driver;
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		// XPath Different examples :
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("himenpatel2011@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Password"); // TagName#Id
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
		System.out.println("Test Run Successfully...!!!!");
		
	}

}
