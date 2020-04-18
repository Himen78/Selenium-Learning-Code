package com.selenium.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExampleTwo {
	
	@Test(groups={"Smoke"})
	public void ThirdTest() // Method name treat as test name in TestNG.
	{
		System.out.println("Hello TestNG Third Method");
	}
	
	@BeforeTest
	public void BeforeTestAnnotation() // This method will execute in first.
	{
		System.out.println("Hello, this is @BeforeTest method");
	}
	
	@AfterTest
	public void AfterTestAnnotation() // This method will execute in last.
	{
		System.out.println("Hello, this is @AfterTest method");
	}
	
	@Test(enabled=false) // This method will skip while execution.
	public void SkipedTestCase() // Method name treat as test name in TestNG.
	{
		System.out.println("Hello method will skip if the enables is false.");
	}
	
	@Test(timeOut=4000) // Wait till 4 MS
	public void TimeOutAnnotation() // This method will execute in last.
	{
		System.out.println("Hello, this is timout method");
	}

}
