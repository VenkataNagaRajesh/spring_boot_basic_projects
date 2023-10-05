package com.example.Exception;



public class StudentNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	private int id;
	private String message;
	public StudentNotFoundException(String message)
	{
		super(message);
		this.message=message;
	}
		
	
}
