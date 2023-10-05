package com.example;

public class Student {
	
	MathCheat mathcheat;
	
	public void setMathCheat(MathCheat m)
	{
		this.mathcheat=m;
	}
	public void cheating()
	{
		mathcheat.mathCheat();
		//	System.out.println();
	}
}
