package com.cucumber.testrunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Runner {
	
	WebDriver driver;
	
	@Given("^Open the Google and start application$")
	public void open_the_Google_and_launch_the_application() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://twitter.com/login");
	}
	
	@When("^I enter valid username and valid password$") 
	public void I_enter_valid_username_and_valid_password() throws Throwable
	{
		driver.findElement(By.xpath("//input[@placeholder='Phone, email or username']")).sendKeys("himenpatel2011@gmail.com");
		driver.findElement(By.xpath("//div[@class='clearfix field']//input[@placeholder='Password']")).sendKeys("harshild");
	}
	
	@Then("^user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() throws Throwable
	{
		driver.findElement(By.xpath("//button[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")).click();
	}

}
