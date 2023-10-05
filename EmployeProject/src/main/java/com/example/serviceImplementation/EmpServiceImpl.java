package com.example.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.EmployeEntity;
import com.example.entity.Project;
import com.example.payload.EmployeDto;
import com.example.repository.EmployeRepository;
import com.example.repository.ProjectRepository;
import com.example.service.EmployeService;

@Service
public class EmpServiceImpl implements EmployeService{

	@Autowired
	private EmployeRepository erepo;
	
	@Autowired
	private ProjectRepository prepo;
	
	

	@Override
	 public EmployeDto getEmployeById(long id) {
		EmployeEntity foundEmployee =erepo.findById(id).get();
		Project project=prepo.findByProjectCode(foundEmployee.getEmployeeAssignedProject());
	     EmployeDto employeDto =new EmployeDto();
	     employeDto.setId( foundEmployee.getId());
	     employeDto.setEmployeName(foundEmployee.getEmpName());
	     employeDto.setEMail(foundEmployee.getEEmail()); 
	     employeDto.setEmployeBaseLocation(foundEmployee.getLocation());
	     employeDto.setProjectCode(project.getProjectCode());
	     employeDto.setProjectName(project.getProjectName());
	     
	     return employeDto;

	}


	@Override
	public EmployeDto saveEmploye(EmployeEntity Emp) {
		EmployeEntity savedEmployee = erepo.save(Emp);
		 Project project=prepo.findByProjectCode(savedEmployee.getEmployeeAssignedProject());
		 EmployeDto employeDto = new EmployeDto();
		 employeDto.setId(savedEmployee.getId());
		 employeDto.setEmployeName(savedEmployee.getEmpName());
		 employeDto.setEmployeBaseLocation(savedEmployee.getLocation());
		 employeDto.setProjectCode(project.getProjectCode());
		 employeDto.setProjectName(project.getProjectName());

		 return employeDto;
	}
	
	

}
