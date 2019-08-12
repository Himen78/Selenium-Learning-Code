package smartbytes.opencart.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	private WebDriver driver;
	@FindBy(name = "firstname")
	private WebElement txtFirstName;
	@FindBy(name = "lastname")
	private WebElement txtLastName;
	@FindBy(name = "email")
	private WebElement txtEmail;
	@FindBy(name = "telephone")
	private WebElement txtTelephone;
	@FindBy(name = "fax")
	private WebElement txtFax;

	@FindBy(name = "company")
	private WebElement txtCompany;
	@FindBy(name = "company_id")
	private WebElement txtCompanyId;
	@FindBy(name = "address_1")
	private WebElement txtAddress_1;
	@FindBy(name = "address_2")
	private WebElement txtAddress_2;
	@FindBy(name = "city")
	private WebElement txtCity;
	@FindBy(name = "postcode")
	private WebElement txtPostcode;

	@FindBy(name = "country_id")
	private WebElement selCountryId;
	@FindBy(name = "zone_id")
	private WebElement selZoneId;

	@FindBy(name="password")
	private WebElement txtPassword;
	@FindBy(name="confirm")
	private WebElement txtConfirmPassword;
	
	@FindBy(name="agree")
	private WebElement chkAgree;
	@FindBy(xpath="//*[@id=\"content\"]/form/div[5]/div/input[2]")
	private WebElement btnRegister;
	
	public RegistrationPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}

	// write the methods...
	public void register(String firstName, String lastName, String email, String telephone, String address1,
			String city, String postCode, String country, String state, String password) {
		// set values for fields
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		txtEmail.sendKeys(email);
		txtTelephone.sendKeys(telephone);
		
		txtAddress_1.sendKeys(address1);
		txtCity.sendKeys(city);
		txtPostcode.sendKeys(postCode);
		
		Select countrySelectBox = new Select(selCountryId);
		//countrySelectBox.selectByValue("13");
		countrySelectBox.selectByVisibleText(country);
		//wait for few seconds before zone is loaded...
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select zoneSelectBox = new Select(selZoneId);
		//countrySelectBox.selectByValue("13");
		zoneSelectBox.selectByVisibleText(state);

		txtPassword.sendKeys(password);
		txtConfirmPassword.sendKeys(password);
		
		chkAgree.click();
		btnRegister.click();
		
		// click on register button.
	}

}
