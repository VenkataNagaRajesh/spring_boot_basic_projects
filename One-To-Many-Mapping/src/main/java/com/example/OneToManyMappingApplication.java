package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.controller.Employe;
import com.example.controller.Task;
import com.example.service.EmpRepo;

@SpringBootApplication
public class OneToManyMappingApplication implements CommandLineRunner
{

	@Autowired
	EmpRepo erepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Employe e1=new Employe("ramesh");
		Employe e2=new Employe("Raju");
		
		Task t1=new Task("UI related issues");
		Task t2=new Task("Login related issues");
		Task t3=new Task("Registraion related issues");
		Task t4=new Task("Deployment issues");
		
		e1.getTask().add(t1);
		e2.getTask().add(t2);
		e1.getTask().add(t3);
		e2.getTask().add(t4);
		
	erepo.save(e1);
	erepo.save(e2);
		//e2.getTask().add(t5);
		
	}

	
}
