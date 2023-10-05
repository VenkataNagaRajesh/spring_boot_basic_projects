package com.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.University;


@Service("Beta")
@Primary
public class BetaUniversity implements University
{

	public String display() {
		return "this is Beeta university";
	}
	

}
