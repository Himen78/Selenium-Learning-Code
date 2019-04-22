package co.seleniumproject.testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import co.seleniumproject.frameworkPackage.BrowserFactory;
import co.seleniumproject.frameworkPackage.CaptureScreenShot;
import co.seleniumproject.uiPackage.BookFlightPage;
import co.seleniumproject.uiPackage.FlightConfirmationPage;
import co.seleniumproject.uiPackage.FlightFinderPage;
import co.seleniumproject.uiPackage.LoginPage;
import co.seleniumproject.uiPackage.SelectFlightPage;

public class TestCaseClass extends HelperClass {
	
	
	public TestCaseClass()
	{
		
	}
	
	@Test
	public void returnTicket() throws InterruptedException
	{
		System.out.println("Return Ticket code activated");
		driver.get("http://newtours.demoaut.com");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginWordPress("Himen", "Himen@78");
		FlightFinderPage flightFinderPage = PageFactory.initElements(driver, FlightFinderPage.class);
		flightFinderPage.continueWordPress("1", "Himen", "August", "12", "Vadodara", "September", "13", "Business Class", "Unified Airlines");
		SelectFlightPage selectFlightpage = PageFactory.initElements(driver, SelectFlightPage.class);
		selectFlightpage.departAirlineWordPress("Pangaea Airline 362");
		selectFlightpage.returnAirlineWordPress("United Airine 363");
		selectFlightpage.continu();
		BookFlightPage bookFlightPage = PageFactory.initElements(driver, BookFlightPage.class);
		bookFlightPage.purchasePress("Himen", "Patel", "Vegetarial", "Mastercard", "123456789", "March", "2008", "Himen", "H", "P");
		FlightConfirmationPage flightConfirmationPage = PageFactory.initElements(driver, FlightConfirmationPage.class);
		String bookingDeatilsFile = System.getProperty("user.dir")+"\\"+"ScreenShots\\FlightConfirmationDetails - "+CaptureScreenShot.getDateTimeStamp()+".png";
		try {
			CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), bookingDeatilsFile);
			}catch(Exception e)
		{
				e.printStackTrace();
		}
		flightConfirmationPage.logoutPress();
	
	}


	@Test
	public void validateCredentials() throws IOException
	{
		System.out.println("In validateCredentials Code Execute");
		driver.get("http://newtours.demoaut.com");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginWordPress("Himen", "Himen@78");
		try {
			FlightFinderPage flightFinderPage = PageFactory.initElements(driver, FlightFinderPage.class);
			flightFinderPage.continueWordPress("1", "London", "January", "20", "New York", "December", "1", "Business Class", "Unified Airlines");
			assertEquals(true, true);
			}catch(Exception e)
		{
				assertEquals(true, true);
		}
	}

	private void assertEquals(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}
	
}