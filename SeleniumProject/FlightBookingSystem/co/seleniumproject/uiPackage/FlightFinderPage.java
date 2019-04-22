package co.seleniumproject.uiPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightFinderPage {
	
	WebDriver driver;
	
	public FlightFinderPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/b[1]/font[1]")
	@CacheLookup
			WebElement roundTrip;
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/b[1]/font[1]")
	@CacheLookup
			WebElement onewayTrip;
	@FindBy(how=How.XPATH,using="//select[@name='passCount']")
	@CacheLookup
			WebElement passCount;
	@FindBy(how=How.XPATH,using="//select[@name='fromPort']")
	@CacheLookup
			WebElement fromPort;
	@FindBy(how=How.XPATH,using="//select[@name='fromMonth']")
	@CacheLookup
			WebElement fromMonth;
	@FindBy(how=How.XPATH,using="//select[@name='fromDay']")
	@CacheLookup
			WebElement fromDay;
	@FindBy(how=How.XPATH,using="//select[@name='toPort']")
	@CacheLookup
			WebElement toPort;
	@FindBy(how=How.XPATH,using="//select[@name='toMonth']")
	@CacheLookup
			WebElement toMonth;
	@FindBy(how=How.XPATH,using="//select[@name='toDay']")
	@CacheLookup
			WebElement toDay;
	@FindBy(how=How.XPATH,using="//select[@name='airline']")
	@CacheLookup
			WebElement airline;
	@FindBy(how=How.XPATH,using="//input[@name='findFlights']")
	@CacheLookup
			WebElement findFlights;
	@FindBy(how=How.XPATH,using=".//*[@value='Business']")
	@CacheLookup
			WebElement serviceClass;

	
	public void continueWordPress(String pCount, String fPort, String fMonth, String fDay, String tPort, String tMonth, String tDate, String serClass, String aline) throws InterruptedException
	 {
			
				Thread.sleep(2000);
				roundTrip.click();
				Thread.sleep(2000);
				passCount.sendKeys(pCount);
				Thread.sleep(2000);
				fromPort.sendKeys(fPort);
				Thread.sleep(2000);
				fromMonth.sendKeys(fMonth);
				Thread.sleep(2000);
				fromDay.sendKeys(fDay);
				Thread.sleep(2000);
				toPort.sendKeys(tPort);
				Thread.sleep(2000);
				toMonth.sendKeys(tMonth);
				Thread.sleep(2000);
				toDay.sendKeys(tDate);
				Thread.sleep(2000);
				serviceClass.sendKeys(serClass);
				Thread.sleep(2000);
				airline.sendKeys(aline);
				Thread.sleep(2000);
				findFlights.click();
				Thread.sleep(2000);
			} 
	} 


	
	
	
	
	


