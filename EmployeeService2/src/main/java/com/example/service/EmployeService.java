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
import com.example.repository.AddressClient;
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
	@Autowired
	AddressClient addressClient;
	
	public EmployeeResponse getEmployeById(int id) {
		Employee employe = emprepo.findById(id).get();
		EmployeeResponse empreponse = modelMapper.map(employe, EmployeeResponse.class);
		AddressResponse addressResponse =addressClient.getAddressByEmployeeId(id);
		empreponse.setAddressResponse(addressResponse);
		
		return empreponse;
	}

}
