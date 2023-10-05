package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.contrller.Employe;
import com.example.contrller.Task;
import com.example.repository.EmpRepositor;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner{

	@Autowired
	EmpRepositor emprepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employe e1=new Employe("anitha");
		Employe e2=new Employe("vanitha");
	
		
		Task t1=new Task("Ui related issues");
		Task t2=new Task("DB related issues");
		Task t3=new Task("Development Related issees");
		
		e1.getTasks().add(t1);
		e1.getTasks().add(t3);
		e2.getTasks().add(t1);
		
		emprepo.save(e1);
		emprepo.save(e2);
	}

	
	
}
