package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.StudentNotFoundException;
import com.example.entity.StudentEntity;
import com.example.errorResponse.ErrorResponse;
import com.example.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService sService;
	@GetMapping("/getData/{id}")
	public ResponseEntity<StudentEntity> getData(@PathVariable int id)
	{
		StudentEntity sResponse=sService.getStudentData(id);
		return   new ResponseEntity<StudentEntity>(sResponse,HttpStatus.OK);
	
	}
	
	@ResponseStatus(HttpStatus.CONFLICT)
	@ExceptionHandler(StudentNotFoundException.class)
	public ErrorResponse StudentNotFoundException(StudentNotFoundException ex)
	{
//		Map<String,String> errorMap=new HashMap<>();
//		errorMap.put("error Message",ex.getMessage());
//		return errorMap;
		return new ErrorResponse(HttpStatus.CONFLICT,ex.getMessage());
	}	
}
