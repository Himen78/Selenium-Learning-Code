package smartbytes.opencart.ui.scenerio;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationProcess {	
	private static final String BROWSER="chrome";
	private static final String HOME_PAGE="http://smartbytes.v-logics.com/ocart";
	private static WebDriver driver=null;
	public static void main(String[] args) {
		
		//Go to Home Page
		if(BROWSER.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
			driver = new ChromeDriver();
		}else if(BROWSER.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/sys/Documents/selenium/drivers/geckodriver");
			driver = new FirefoxDriver();
		}else {
			//IE
		}
		System.out.println("Opening URL :" + HOME_PAGE);
		driver.get(HOME_PAGE);

		//Click on create new account link.
		driver.findElement(By.linkText("create an account")).click();
		
		//Your Personal Details
		fillUpPersonalDetails("Jhon","Doe","jhondoe@smartbytes.com","1234568","6373638");
		//Your Address
		fillUpAddressDetails("Smart Bytes","SM000","Falkon Road","Addres 2","Sydney","1234");
		//Your Password
		driver.findElement(By.name("password")).sendKeys("pass123");
		driver.findElement(By.name("confirm")).sendKeys("pass123");
		//Newsletter
		System.out.println("Select the radio button");
		List<WebElement> newsLetterRadioButtons= driver.findElements(By.name("newsletter"));
		newsLetterRadioButtons.get(0).click(); //yes
		//Fill up the form and submit
		driver.findElement(By.name("agree")).click();
		//click submit
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/input[2]")).click();
	}
	/**
	 * This method is used to fill up personal details on Registration Page
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param telephone
	 * @param fax
	 */
	public static void fillUpPersonalDetails(String firstName,String lastName,String email,String telephone,String fax) {
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("telephone")).sendKeys(telephone);
		driver.findElement(By.name("fax")).sendKeys(fax);

	}
	/**
	 * This method is used to fill up address details on Registration Page
	 * @param company
	 * @param companyId
	 * @param address1
	 * @param address2
	 * @param city
	 * @param postCode
	 */
	public static void fillUpAddressDetails(String company,String companyId,String address1,String address2,String city,String postCode) {
		driver.findElement(By.name("company")).sendKeys(company);
		driver.findElement(By.name("company_id")).sendKeys(companyId);
		driver.findElement(By.name("address_1")).sendKeys(address1);
		driver.findElement(By.name("address_2")).sendKeys(address2);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("postcode")).sendKeys(postCode);
		//select country
		WebElement countryElement = driver.findElement(By.name("country_id"));
		Select countrySelectBox = new Select(countryElement);
		//countrySelectBox.selectByValue("13");
		countrySelectBox.selectByVisibleText("Australia");
		//wait for few seconds before zone is loaded...
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("setting zone");
		WebElement zoneElement = driver.findElement(By.name("zone_id"));
		Select zoneSelectBox = new Select(zoneElement);
		//countrySelectBox.selectByValue("13");
		zoneSelectBox.selectByVisibleText("New South Wales");
	}
	
	
	
	
	
	
	
}
