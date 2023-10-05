package com.example.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Project;
import com.example.repository.ProjectRepository;
import com.example.service.ProjectService;

@Service
public class ProjectServiceImplementaion  implements ProjectService{


	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public Project saveProejct(Project project) {
		Project s=projectRepository.save(project);
		return s;
	}

	@Override
	public Project getProjectByCode(long projectCode) {
		Project fp=projectRepository.findByProjectCode(projectCode);
		return fp;
	}

}
