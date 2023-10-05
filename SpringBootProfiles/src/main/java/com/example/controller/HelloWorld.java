package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	private static Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);
	
	
	@Value("${spring.message}")
	private String message;

	@GetMapping("/hw")
	public String welcome()
	{
		LOGGER.info("returnning the response");
		return message;
	}
	
	
	
	
	
}
