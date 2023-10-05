package com.example.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.AddressEntity;
import com.example.repo.AddressRepository;
import com.example.response.AddressResponse;

@Service
public class AddressService {

	
	@Autowired
	AddressRepository addressRepo;
	@Autowired
	public ModelMapper modelMapper;
	public AddressResponse findEmployeeByEmployeeId(int eId) {
		
		AddressEntity addressEntity= addressRepo.findAddressByEmployeeId(eId);
		System.out.println("address Service"+addressEntity);
		AddressResponse addressResponse=modelMapper.map(addressEntity, AddressResponse.class);
		System.out.println(eId);
		return addressResponse;
	}
	
	
	public AddressEntity saveEmployeAddressData(AddressEntity edata )
	{
	System.out.println("\n\n\n "+edata+"\n\n\n");
		AddressEntity adr=addressRepo.save(edata);
		System.out.print(adr);
		return adr;
	}
	public List<AddressEntity> findEmployeeByEmployee() {
		return addressRepo.findAll();
	}
	
	public void deleteEmployeeByEmployee(int id)
	{
		addressRepo.deleteById(id);
	}
}
