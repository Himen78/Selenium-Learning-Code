package com.selenium.testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGExampleOne {
	
	@Test(groups={"Smoke"})
	public void FirstTest() // Method name treat as test name in TestNG.
	{
		System.out.println("Hello TestNG First Method");
	}
	
	@Test
	public void SecondTest() // Method name treat as test name in TestNG.
	{
		System.out.println("Hello TestNG Second Method - Include this method from this method using include from XML");
	}
	
	@BeforeSuite
	public void BeforeSuiteMethod() // Method name treat as test name in TestNG.
	{
		System.out.println("This is run before run any suite from XML.");
	}
	
	@Test(dependsOnMethods={"SecondTest"})
	public void DefendsMethodTest() // Method name treat as test name in TestNG.
	{
		System.out.println("Hello method is fully dependent on SecondTest method");
	}

}
