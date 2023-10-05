package com.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	B b;

	public void m1()
	{
		System.out.println("this is m2 method");
		b.m2();
	}


	public B getB() {
		return b;
	}

	@Autowired
	public void setB(B b) {
		this.b = b;
	}
}
