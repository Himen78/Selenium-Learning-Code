package com.selenium.dropdowns;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Let's Understand about the Dynamic Dropdown
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
	//	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(3000);
    //		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //  I can see two same Ids in both Dropdown so I will pick the the value from second Dropdown instead on Frist That's why I written[2] for select 2nd Id.
	
          driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click(); // -  Instead of [2] Parent-Child xpath 
		
		System.out.println("Test Run Successfully...!!!!");
	}
}
