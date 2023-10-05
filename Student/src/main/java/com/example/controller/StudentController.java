package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.repository.StudentRepository;


@RestController
@RequestMapping("v1/student")
public class StudentController {

	@Autowired
	private StudentRepository repo;

	@GetMapping("/getAll")
	public List<Student> getAll()
	
	{
		return repo.findAll();
		
	}
	
	@PostMapping("/create")
	private Student createStudent(@RequestBody Student student)
	{
		return repo.save(student);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Student>> getStudent(@PathVariable int id)
	{
		System.out.println("hai");
		Optional<Student> student=repo.findById(id);
		return ResponseEntity.ok(student);
	}

	
	@PutMapping("update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student studentdetails)
	{
		Student student = repo.findById(id).get();
		student.setSdept(studentdetails.getSdept());
		student.setSname(studentdetails.getSname());
		student.setSphone(studentdetails.getSphone());
		
		repo.save(student);
		
		return ResponseEntity.ok(student);
		
	
		
		
	
	}
	
	
}























