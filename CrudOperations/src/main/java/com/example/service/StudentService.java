package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepo;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service
public class StudentService{

	@Autowired
	StudentRepo repo;
	
	public Student saveData(Student student)
	{
		return repo.save(student);
	}
	
	public List<Student> getAll()
	{
		return repo.findAll();
	}

	public Student getById(int id)
	{
		return repo.findById(id).get();
	}
	
	public Student updateStudent(Student student)
	{
		Student students=repo.findById(student.getSid()).get();
		students.setStudentName(student.getStudentName());
		students.setBranch(student.getBranch());
		students.setGrade(student.getGrade());
		Student st=repo.save(students);
		System.out.println(st.toString());
		return st;
	}
}
