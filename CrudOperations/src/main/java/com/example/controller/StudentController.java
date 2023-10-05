package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/v1/api")
public class StudentController {
	
	@Autowired
	StudentService s;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Hello World";
	}
	
	
	@PostMapping("/add")
	public Student addUser(@RequestBody Student student)
	{
		return s.saveData(student);
	}
	
	
	@GetMapping("all")
	public List<Student> getAll()
	{
		return s.getAll();
	}
	
	@GetMapping("one/{id}")
	public Student getStudent(@PathVariable int id)
	{
		return s.getById(id);
	}
	
	
	@PutMapping("update/{id}")
	public ResponseEntity<Student> updateUser(@PathVariable int id,@RequestBody Student student)
	{
			student.setSid(id);
			Student students=s.updateStudent(student);
			return new ResponseEntity<Student>(students,HttpStatus.OK);
	}
	
	
}