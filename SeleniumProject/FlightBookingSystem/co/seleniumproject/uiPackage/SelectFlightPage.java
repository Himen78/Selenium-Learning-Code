package co.seleniumproject.uiPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectFlightPage {
	
	WebDriver driver;
	
	public SelectFlightPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[3]/td[1]")
	@CacheLookup
			WebElement BlueSkiesAirlines360_D;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]")
	@CacheLookup
			WebElement BlueSkiesAirlines361_D;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[1]")
	@CacheLookup
			WebElement BlueSkiesAirlines362_D;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[9]/td[1]")
	@CacheLookup
			WebElement BlueSkiesAirlines363_D;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[3]/td[1]")
	@CacheLookup
			WebElement BlueSkiesAirlines360_T;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[5]/td[1]")
	@CacheLookup
			WebElement BlueSkiesAirlines361_T;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[7]/td[1]")
	@CacheLookup
			WebElement BlueSkiesAirlines362_T;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[9]/td[1]")
	@CacheLookup
			WebElement BlueSkiesAirlines363_T;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/p[1]/input[1]")
	@CacheLookup
			WebElement con;
	
	
	public void departAirlineWordPress(String departAirline) throws InterruptedException
	{
		if(departAirline.equalsIgnoreCase("Blue Skies Airlines 360"))
		{
			BlueSkiesAirlines360_D.click();
			Thread.sleep(2000);
		}
		if(departAirline.equalsIgnoreCase("Blue Skies Airlines 361"))
		{
			BlueSkiesAirlines361_D.click();
			Thread.sleep(2000);
		}
		if(departAirline.equalsIgnoreCase("Blue Skies Airlines 362"))
		{
			BlueSkiesAirlines362_D.click();
			Thread.sleep(2000);
		}
		if(departAirline.equalsIgnoreCase("Blue Skies Airlines 363"))
		{
			BlueSkiesAirlines363_D.click();
			Thread.sleep(2000);
		}
		
	}
	
	public void returnAirlineWordPress(String returnAirline) throws InterruptedException
	{
		if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 360"))
		{
			BlueSkiesAirlines360_T.click();
			Thread.sleep(2000);
		}
		
		if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 361"))
		{
			BlueSkiesAirlines361_T.click();
			Thread.sleep(2000);
		}
		
		if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 362"))
		{
			BlueSkiesAirlines362_T.click();
			Thread.sleep(2000);
		}
		
		if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 363"))
		{
			BlueSkiesAirlines363_T.click();
			Thread.sleep(2000);
		}
	}
	
	
	public void continu() throws InterruptedException
	{
		try {
			con.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
