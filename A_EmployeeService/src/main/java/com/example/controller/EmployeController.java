package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeController {

	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/eaddress")
	public String getEmployee()
	{
		String address=restTemplate.getForObject("http://localhost:8082/address", String.class);
		return "Name: Abhilash,email:abhilashNagar......."+address;
	}
}
