package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.repository.EmployeRepo;
import com.example.response.EmployeeResponse;
import com.example.service.EmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	private EmployeService empservice;
	
	@Autowired
	private EmployeRepo empRepo;
	
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id)
	{
		System.out.println("hai"+id);
		
	EmployeeResponse employeresponse= empservice.getEmployeById(id);
		return  ResponseEntity.status(HttpStatus.OK).body(employeresponse);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAll()
	{
		List<Employee> emp=empRepo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(emp);
	}
}
