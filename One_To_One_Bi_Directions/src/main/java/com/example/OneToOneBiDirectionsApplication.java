package com.example;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.controller.Employe;
import com.example.controller.Task;
import com.example.repo.EmpRepo;

@SpringBootApplication
public class OneToOneBiDirectionsApplication implements CommandLineRunner{

	@Autowired
	EmpRepo erepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneBiDirectionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employe e1=new Employe("teja");
		Employe e2=new Employe("raja");
		Employe e3=new Employe("vanaja");
		Employe e4=new Employe("girija");
	//	Employe e5=new Employe("saroja");
	//	Employe e6=new Employe("mahija");
		
		
			Task t1=new Task("UI Related issues");
			Task t2=new Task("DBA Desigining");
			Task t3=new Task("Login page issues");
			
		e1.setTask(t1);
		e2.setTask(t3);
		e3.setTask(t1);
		e4.setTask(t2);
		
	erepo.save(e1);
	erepo.save(e2);
	erepo.save(e4);
		
		
	}
	
	

}
