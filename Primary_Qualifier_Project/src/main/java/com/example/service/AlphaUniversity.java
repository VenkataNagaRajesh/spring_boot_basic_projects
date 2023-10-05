package com.example.service;

import org.springframework.stereotype.Service;

import com.example.University;

@Service("Alpha")
public class AlphaUniversity implements University
{


	public String display() {
		return "this is alpha university";
	}

}
