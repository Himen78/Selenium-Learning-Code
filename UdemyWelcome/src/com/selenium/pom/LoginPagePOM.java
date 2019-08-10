package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	
	private WebDriver driver;
	
	// Properties of Login Page
	// Email
	@FindBy(name="email") // We don't need to define the driver.findElement method for declaration of Element.
	private WebElement txtEmail; // Please follow proper naming convention
	// Password
	@FindBy(name="password") // We don't need to define the driver.findElement method for declaration of Element.
	private WebElement txtPassword;
	// Login button
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/form/div/input[3]") // We don't need to define the driver.findElement method for declaration of Element.
	private WebElement btnLogin;
	
	
	public LoginPagePOM(WebDriver webDriver)
	{
		this.driver = webDriver;
		PageFactory.initElements(driver, this); // For initialization page element.
	}
	
	public void performLogin(String email, String password)
	{
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}

}
