package com.example.controller;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task_table")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int task_id;

	private String task_name;



	public Task(String task_name) {
		super();
		this.task_name = task_name;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	
}