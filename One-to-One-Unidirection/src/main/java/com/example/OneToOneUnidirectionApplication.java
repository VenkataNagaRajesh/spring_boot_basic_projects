package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.enity.Employee;
import com.example.enity.Task;
import com.example.repository.EmpRepo;

@SpringBootApplication
public class OneToOneUnidirectionApplication  implements CommandLineRunner{

	@Autowired
	private EmpRepo erepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneUnidirectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e=new Employee("naveen");
		Employee e1=new Employee("hussain");
		
		Task t=new Task("Login issues is assign to hussian");;
		Task t1=new Task("Registration issues are assign to navven");
		
		e.setTask(t);
		e1.setTask(t1);
		
		erepo.save(e);
		erepo.save(e1);
	}

}
