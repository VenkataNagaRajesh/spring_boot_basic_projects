package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="employes")
public class Employe {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	
	@Column
	private String empName;
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="EmpId")
	private List<Task> tasks=new ArrayList<>();
	
	
	public Employe(String name)
	{
		super();
		this.empName=name;
		
	}
	
	public List<Task> getTask(){
		return tasks;
	}
	
	public void setTasks(List<Task> tasks)
	{
		this.tasks=tasks;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
