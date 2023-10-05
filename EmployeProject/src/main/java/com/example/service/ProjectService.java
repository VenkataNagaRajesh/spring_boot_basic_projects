package com.example.service;

import com.example.entity.Project;

public interface ProjectService {
	
	public Project saveProejct(Project project);
	public Project getProjectByCode(long employeeAssignedProject);
}
