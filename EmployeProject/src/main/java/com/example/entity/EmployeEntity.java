package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EmployeTable")
public class EmployeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="ename",nullable=false)
	private String empName;
	@Column(name="email",nullable=false)
	private String eEmail;
	@Column(name="eproject",nullable=false)
	private long employeeAssignedProject;
	@Column(name="location",nullable=false)
	private String location;
	
	
}
	