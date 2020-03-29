package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAssignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> list = driver.findElements(By.id("checkBoxOption3"));
		int countOfCheckBox = list.size();

		for (int i = 0; i < countOfCheckBox; i++) {
			String checkBoxName = list.get(i).getAttribute("value");

			if (checkBoxName.equalsIgnoreCase("option3")) {
				list.get(i).click();
				Select dropdownOption = new Select(driver.findElement(By.id("dropdown-class-example")));
				dropdownOption.selectByValue(checkBoxName);

				driver.findElement(By.id("name")).sendKeys(checkBoxName);
				driver.findElement(By.id("alertbtn")).click();

				Alert alert = driver.switchTo().alert();
				String alertMessage = driver.switchTo().alert().getText();
				System.out.println(alertMessage);
				if (alertMessage.contains(checkBoxName)) {
					System.out.println("Alert Message is contain the value :" + checkBoxName);
				} else {
					System.out.println("Alert Message is not contain the value" + checkBoxName);
				}
				alert.accept();
				break;
			}
		}

	}

}
