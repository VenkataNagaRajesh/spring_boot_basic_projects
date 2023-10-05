package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EmployeEntity;
import com.example.payload.EmployeDto;
import com.example.service.EmployeService;

@RestController
@RequestMapping("api/employe")
public class EmployeController {
	
	@Autowired
	EmployeService eService;
	
	@PostMapping("/save")
	public EmployeDto saveEmp(@RequestBody EmployeEntity eEntity)
	{
		System.out.println(eEntity.toString());
		return eService.saveEmploye(eEntity);
	}
	
		@GetMapping("{id}")
		public EmployeDto getempployeeBy(@PathVariable(name="employee_1d") long id)
		{
			return eService.getEmployeById(id);
		
		}
}
