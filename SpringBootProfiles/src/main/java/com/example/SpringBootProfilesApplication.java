package com.example;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringBootProfilesApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringBootProfilesApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesApplication.class, args);
		
		LOGGER.info("spring boot profiles application is running successfully");
	}

}
