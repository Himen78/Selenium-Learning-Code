package co.seleniumproject.testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import co.seleniumproject.frameworkPackage.BrowserFactory;

public class HelperClass {
	
	public static WebDriver driver;
	BrowserFactory obj1;
	
	public HelperClass()
	{
		
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("in @Before Class");
	}
	
	@BeforeMethod
	public void beforeMethodClass()
	{
		System.out.println("@BeforeMethod");
		HelperClass.driver = BrowserFactory.getDriver();
	}
	
	@AfterClass
	public void close()
	{
		
	}
	
	@AfterSuite
	public void afterSuite() throws IOException, Exception{
		driver.quit();
	}
	
	
	

}
