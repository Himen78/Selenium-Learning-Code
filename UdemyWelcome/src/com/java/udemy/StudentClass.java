package com.java.udemy;

public class StudentClass {
	
	int idOfStudent;
	String nameOfStudent;
	String branchOfStudent;
	
	public StudentClass(int idOfStudent)
	{
		this.idOfStudent = idOfStudent;
	}
	
	public StudentClass(String nameOfStudent, String branchOFStudent)
	{
		this.nameOfStudent = nameOfStudent;
		this.branchOfStudent = branchOFStudent;
	}

	@Override
	public String toString() {
		return "StudentClass [idOfStudent=" + idOfStudent + ", nameOfStudent=" + nameOfStudent + ", branchOfStudent="
				+ branchOfStudent + "]";
	}
	
	

}
