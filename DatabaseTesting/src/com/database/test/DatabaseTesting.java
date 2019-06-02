package com.database.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseTesting {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/redhat";
	
	// Database Credentials 
	
	static final String USER = "root";
	static final String PASS = "password";
	
	public static void main(String[] args)
	{
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting Database");
			conn = DriverManager.getConnection(DB_URL, "root", "password");
			
			System.out.println("Creating Connection");
			
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT Id, Name, Surname, Address FROM employeedata";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				// Retrieve from column name in DB
				int Id = rs.getInt("Id");
				String Name = rs.getString("Name");
				String Surname = rs.getString("Surname");
				String Address = rs.getString("Address");
				
				// Print the values
				
				System.out.println("ID:" + Id);
				System.out.println("Name: " + Name);
				System.out.println("Sutname: "+ Surname);
				System.out.println("Addess:"+ Address);
				}
			// Cleaning the environment
			
			rs.close();
			stmt.close();
			conn.close();
		}catch (SQLException se)
		{
			se.printStackTrace();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
