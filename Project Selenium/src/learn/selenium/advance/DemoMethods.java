package learn.selenium.advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle()); // Validate the Page title
		System.out.println(driver.getCurrentUrl()); // Validate the Current URL which passed on.
		System.out.println(driver.getPageSource()); // Get the Page source.

		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		// driver.navigate().forward();

		driver.close(); // Closing the Google Page after test is completed.(Close the current Browser)
		driver.quit(); // Closing the all the opened browsers.		

	}

}
