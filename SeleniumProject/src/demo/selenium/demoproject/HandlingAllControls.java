package demo.selenium.demoproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandlingAllControls {
	
	static WebDriver driver;
	
	@Test( priority = 0)
	public void EdurekaProfile() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.linkText("Log In")).click();
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.id("si_popup_email")));
	Thread.sleep(1000);
	actions.click();
	actions.sendKeys("himenpatel2011@gmail.com");
	Thread.sleep(1000);
	actions.build().perform();
	actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
	Thread.sleep(1000);
	actions.click();
	actions.sendKeys("*******");
	Thread.sleep(2000);
    actions.build().perform();
    actions.moveToElement(driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")));
    Thread.sleep(1000);
    actions.click();
    actions.build().perform();
    
    driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']"));
    Thread.sleep(2000);
    driver.findElement(By.xpath("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']"));
    Thread.sleep(2000);
    
   /* WebDriverWait waitElment = new WebDriverWait(driver, 10);
    waitElment.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(), 'My Profile')]")));
    driver.findElement(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(), 'My Profile')]")).click();
    String Pagetitle = driver.getTitle();*/
    
    driver.findElement(By.xpath("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[@class='trackButton'][contains(text(),'Log Out')]")).click();
    
   // Thread.sleep(2000);
    
    System.out.println("Test run successfully");
    
    
    
    
    
    
	
	
	}

}
