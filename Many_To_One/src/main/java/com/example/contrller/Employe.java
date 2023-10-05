package com.example.contrller;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp_Tab")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;

	private String empName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId")
	private List<Task> tasks = new ArrayList<>();

	public Employe(String empName) {
		super();
		this.empName = empName;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}
