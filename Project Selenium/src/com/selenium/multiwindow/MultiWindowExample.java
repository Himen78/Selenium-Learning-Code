package com.selenium.multiwindow;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com/");
		String mainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();

			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		// This is to switch to the main window
		driver.switchTo().window(mainWindow);
	}
	
	// driver.findElement(By.xpath("//div[@class='IMH1vc lUHSR Hj2jlf']")).click();
	// driver.findElement(By.xpath("//a[contains(text(),'Learn more')]")).click();
	// System.out.println(driver.getTitle());
	// Set<String> ids = driver.getWindowHandles();
	// Iterator<String> Id = ids.iterator();
	// String ParentId = Id.next();
	// String ChildId = Id.next();
	// driver.switchTo().window(ChildId);
	// System.out.println(driver.getTitle());
}
