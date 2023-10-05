package com.example.contrller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Task_tables")
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int task_id;
	
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
}
