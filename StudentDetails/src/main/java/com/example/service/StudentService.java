package com.example.service;

import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Exception.StudentNotFoundException;
import com.example.entity.StudentEntity;
import com.example.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sRepository;
	
	public StudentEntity saveData(StudentEntity studentEntity){
		return sRepository.save(studentEntity);
	}
	
	public StudentEntity getStudentData(int id)
	{
	return sRepository.findById(id).orElseThrow(() ->  new StudentNotFoundException("Student is not found with "+id));
	}
}
