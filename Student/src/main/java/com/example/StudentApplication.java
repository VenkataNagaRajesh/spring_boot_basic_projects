package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Autowired
	private StudentRepository srepo;
	
	@Override
	public void run(String... args) throws Exception {
		Student s=new Student();
		s.setSname("kiran");
		s.setSdept("Commerce");
		s.setSphone(8500224270L);
		
		
	}

	
}
