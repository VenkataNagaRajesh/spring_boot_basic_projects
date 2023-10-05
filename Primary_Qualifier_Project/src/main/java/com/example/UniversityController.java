package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {
	
	
	@Autowired
	@Qualifier("Beta")
	private University un;
	
	@GetMapping("/university")
	public String getUniveristy()
	{
		return un.display();
	}

}
