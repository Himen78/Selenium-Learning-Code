package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGExampleThird {
	
	@BeforeClass
	public void BeforeClassMethodTest() // Method name treat as test name in TestNG.
	{
		System.out.println("This will run before run any method in perticular class.");
	}
	
	@BeforeMethod
	public void BeforeMethodTest() // Method name treat as test name in TestNG.
	{
		System.out.println("This will run every time before run any method in perticular class.");
	}
	
	@Test(groups={"Smoke"})
	public void ForthTest() // Method name treat as test name in TestNG.
	{
		System.out.println("Hello TestNG Forth Method");
	}
	
	@Test(groups={"Smoke"})
	public void FifthTest() // Method name treat as test name in TestNG.
	{
		System.out.println("Hello TestNG Fifth Method");
	}
	
	@Test
	public void ExcludeMethodExample() // This is exclude method. I have exclude this method from XML file.
	{
		System.out.println("Hello this is exclude method.");
	}
	
	@AfterMethod
	public void AfterMethodTest() // Method name treat as test name in TestNG.
	{
		System.out.println("This will run every time after run any method in perticular class.");
	}
	
	@AfterSuite
	public void AfterSuiteMethod() // Method name treat as test name in TestNG.
	{
		System.out.println("This is run after run any suite from XML.");
	}
	
	@AfterClass
	public void AfterClassMethodTest() // Method name treat as test name in TestNG.
	{
		System.out.println("This will run after run all the methods from perticular class.");
	}
	
	@Parameters({"UserLoginID", "UserPassword"})
	@Test
	public void ParameterClassMethodTest(String LoginId, String Password) // Method name treat as test name in TestNG.
	{
		System.out.println("This will run after run all the methods from perticular class.");
		System.out.println(LoginId);
		System.out.println(Password);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		// 1. Dataset 1 - Username and Password
		// 2. Dataset 2 - Username and Password
		// 3. Dataset 3 - Username and Password
		
		Object[][] dataSet = new Object[3][2]; // 3 - Data Set, 2 - Data i.e : UID, Pass
		
		// 1. Dataset 1
		dataSet[0][0] = "DataSetFirstID";
		dataSet[0][1] = "DataSetFirstPassword";
		
		// 2. Dataset 2
		dataSet[1][0] = "DataSetSecondID";
		dataSet[1][1] = "DataSetSecondPassword";
		
		// 3. Dataset 3
		dataSet[2][0] = "DataSetThirdID";
		dataSet[2][1] = "DataSetThirdPassword";
		
		return dataSet;
		
	}
	
	@Test(dataProvider="getData") // We can get data from data provider annotation.
	public void dataProviderMethod(String LoginID, String LoginPassword)
	{
		System.out.println(LoginID);
		System.out.println(LoginPassword);
		
	}
	

}
