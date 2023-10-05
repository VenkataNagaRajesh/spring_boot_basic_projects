package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@GetMapping("/address")
	public String getAddress()
	{
		return "lake road,Marthali, banglore";
	}
	
}
