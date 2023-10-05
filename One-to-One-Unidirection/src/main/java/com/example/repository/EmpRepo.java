package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.enity.Employee;

public interface EmpRepo  extends JpaRepository<Employee, Integer> {
	
}
