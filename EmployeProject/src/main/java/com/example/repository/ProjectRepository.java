package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	@Query(value = "select *  from Prject where employeeAssignedProject=?1",nativeQuery = true)
	public Project findByProjectCode(long employeeAssignedProject);

}