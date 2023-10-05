package com.example.config;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;


public class ProfileConfig {

	private static Logger LOGGER=LoggerFactory.getLogger(ProfileConfig.class);
	
	@Profile(value ="local")
	@Bean
	public void localConfig()
	{
		LOGGER.info("SuccessFully loaded the environment");
	}
	
	@Profile(value="dev")
	@Bean
	public void devConfig()
	{
		LOGGER.info("successfully loaded the development environment");
	}
	
	@Profile(value="qa")
	@Bean
	public void qaConfig()
	{
		LOGGER.info("successfully loaded the qa config");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
}
