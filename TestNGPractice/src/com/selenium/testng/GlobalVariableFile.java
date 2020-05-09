package com.selenium.testng;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;

public class GlobalVariableFile {
	
	@Test
	public void Login() throws Exception
	{
		Properties prop = new Properties(); // Properties object for fetch the data from file.
		FileInputStream fileInput = new FileInputStream("H:\\Git\\MyLocalGit\\TestNGPractice\\src\\com\\selenium\\testng\\DataDriven.properties"); 
		prop.load(fileInput);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
	}

}
