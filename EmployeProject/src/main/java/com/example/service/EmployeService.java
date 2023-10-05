package com.example.service;


import com.example.entity.EmployeEntity;
import com.example.payload.EmployeDto;


public interface EmployeService{

	public EmployeDto saveEmploye(EmployeEntity Emp);
	public EmployeDto getEmployeById(long id);

}
