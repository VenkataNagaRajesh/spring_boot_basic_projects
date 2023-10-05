package com.example.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controller.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
