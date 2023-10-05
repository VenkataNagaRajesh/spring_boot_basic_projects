package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Project;
import com.example.service.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping
	public Project createProject(@RequestBody Project pro)
	{
		return projectService.saveProejct(pro);
	}
	
	@GetMapping("/(project_code}")
	 public Project getProjectByCode( @PathVariable(name="project_cade") long project_code)
	 {
	     return projectService.getProjectByCode(project_code);
	 }

}
