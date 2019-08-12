package smartbytes.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithButton {
 public static void main(String[] args) {
		String expectedTitle = "Regisger Account";
		String actualTitle = "";
		// 1.Open the URL
		// http://smartbytes.v-logics.com/ocart/index.php?route=account/register
		String url = "http://smartbytes.v-logics.com/ocart/index.php?route=account/register";
		// Register Chrome Driver
		System.out.println("Registering driver...");
		System.setProperty("webdriver.chrome.driver", "/Users/sys/Documents/selenium/drivers/chromedriver");
		// create the instance of chrome driver.
		WebDriver driver = new ChromeDriver();
		// Open the URL
		System.out.println("Opening URL :" + url);
		driver.get(url);
		// 2. Enter First Name,Last Name,Email and Telephone.
		actualTitle = driver.getTitle();
		System.out.println("Page title is :"+ actualTitle);
		
		//Click the button.
		System.out.println("Clicking on button.");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/input[2]")).click();
		
}
}
