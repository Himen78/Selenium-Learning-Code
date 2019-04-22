package co.seleniumproject.uiPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightConfirmationPage {
	
	WebDriver driver;
	
	public FlightConfirmationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[7]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]/img[1]")
	@CacheLookup
			WebElement logout;
	
	public void logoutPress()
	{
		logout.click();
	}
	
	

}
