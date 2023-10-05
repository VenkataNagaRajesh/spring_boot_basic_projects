package com.example.controller;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employe_table")
public class Employe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	
	private String empName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="employe_task", joinColumns={ @JoinColumn(name="emp_id")},inverseJoinColumns= {
			@JoinColumn(name="task_id")
	})
	private Task task;

	public Employe(String empName) {
		super();
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
	
	
}
















