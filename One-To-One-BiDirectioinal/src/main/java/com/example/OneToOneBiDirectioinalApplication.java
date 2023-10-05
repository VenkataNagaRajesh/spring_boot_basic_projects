package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.controller.Employee;
import com.example.controller.Task;
import com.example.service.EmployeeRepo;

@SpringBootApplication
public class OneToOneBiDirectioinalApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepo empRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneBiDirectioinalApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
		Employee emp1=new Employee("Naveen");
		Employee emp2=new Employee("Russian");
		
		Task task1=new Task("Login issue is assigned to hussain");
		Task task2=new Task("Registration issues is assigned to Naveen");
		
		emp1.setTask(task1);
		emp2.setTask(task2);
		
		empRepo.save(emp1);
		empRepo.save(emp2);
		
	}
	

}
