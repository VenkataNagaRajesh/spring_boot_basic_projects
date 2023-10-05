package com.example.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.entity.Employee;
import com.example.repository.EmployeRepo;
import com.example.response.AddressResponse;
import com.example.response.EmployeeResponse;
@Service
public class EmployeService {
	@Autowired
	private EmployeRepo emprepo;
	@Autowired
	public WebClient webClient;
	@Autowired
	private ModelMapper modelMapper;
	public EmployeeResponse getEmployeById(int id) {
		Employee employe = emprepo.findById(id).get();
		System.out.print(employe);
		EmployeeResponse empresponse = modelMapper.map(employe, EmployeeResponse.class);
		AddressResponse addressResponse = webClient.get()
													.uri("/address/" + id)
													.retrieve()
													.bodyToMono(AddressResponse.class)
													.block();

		empresponse.setAddressResponse(addressResponse);
		System.out.print(empresponse);
		return empresponse;
	}
	public List<Employee> getAll()
	{
		List<Employee> emp= emprepo.findAll();
		return emp;
	}

}
