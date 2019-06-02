package com.database.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DatabaseTestingDemo {
	
	static Connection con = null;
	private static Statement stmt;
	public static String DB_URL = "jdbc:mysql://localhost/redhat";
	public static String DB_USER = "root";
	public static String DB_PASSWORD = "password";
	
	@BeforeTest
	public void setUp() throws Exception
	{
		try {
			String dbClass = "com.mysql.jdbc.Driver";
			Class.forName(dbClass).newInstance();
			
			// Get connection to DB
			
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			// Statement object to send the SQL Statement to the DB
			
			stmt = con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void test()
	{
		try {
			String query = "SELECT Id, Name, Surname, Address FROM employeedata";
			
			ResultSet res = stmt.executeQuery(query);
			
			while (res.next())
			{
				System.out.print(res.getInt(1));
				System.out.print("\t"+ res.getString(2));
				System.out.print("\t"+ res.getString(3));
				System.out.println("\t"+ res.getString(4));
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void closedConn() throws Exception
	{
		if (con != null)
		{
			con.close();
	
		}
	}

}
