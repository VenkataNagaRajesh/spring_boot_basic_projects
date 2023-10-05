package com.example;

public class Student {

	int id;
	
	String StudentName;
	
	
	public Student(int id, String studentName) {
		super();
		this.id = id;
		StudentName = studentName;
	}


	public void displayStudentInfo()
	{
		System.out.println("Student name is: "+StudentName+" \nId is "+id);
	}

}
