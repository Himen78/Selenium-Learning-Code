package com.selenium.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageTableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalRun = 0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/25470/indiawb-vs-indwa-4th-match-womens-t20-challenger-trophy-2020");
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0; i<count-2;i++)
		{
			String countRows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueInteger = Integer.parseInt(countRows);
			totalRun = totalRun + valueInteger;
		}
		System.out.println(totalRun);
		
		// Get the sibling value from table.
		String extrasRun = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int calculateExtraRun = Integer.parseInt(extrasRun);
		int finalRun = calculateExtraRun + totalRun;
		System.out.println(finalRun);
		
		// Check the total run
		String  scoreBoardRun = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int finalScoreBoard = Integer.parseInt(scoreBoardRun);
		
		if(finalScoreBoard==finalRun)
		{
			System.out.println("Team score count matches!!!");
		}
		else
		{
			System.out.println("Team score count fails!!!");
		}
        
	}

}
