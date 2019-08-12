package smartbytes.opencart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	// Properties of Login Page
	// Email
	@FindBy(name="email")
	private WebElement txtEmail;
	// Password
	@FindBy(name="password")
	private WebElement txtPassword;
	// Login button
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/form/div/input[3]")
	private WebElement btnLogin;
	
	public LoginPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}
	//driver.findElement(By.name)
	public void performLogin(String email,String password) {
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
}
