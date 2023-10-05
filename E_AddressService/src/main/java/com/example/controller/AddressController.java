package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.AddressEntity;
import com.example.response.AddressResponse;
import com.example.service.AddressService;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address/{id}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("id")int id)
	{
		System.out.println(id);
		AddressResponse addressResponse=null;
		addressResponse=addressService.findEmployeeByEmployeeId(id);
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
	
	@PostMapping("/address/save")
	public ResponseEntity<AddressEntity> SaveEmploye(@RequestBody AddressEntity edata)
	{
		System.out.println(edata);
		AddressEntity a =addressService.saveEmployeAddressData(edata);
		return ResponseEntity.status(HttpStatus.OK).body(a);
		
	}
	
	@PutMapping("/address/update/{id}")
	public ResponseEntity<AddressEntity> updateEmploye(@PathVariable int id,@RequestBody AddressEntity edata)
	{
		System.out.println(edata);
		edata.setId(id);
		AddressEntity a =addressService.saveEmployeAddressData(edata);
		return ResponseEntity.status(HttpStatus.OK).body(a);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<AddressEntity>> getAddressByEmployeeId()
	{
		List<AddressEntity> addressEntity=addressService.findEmployeeByEmployee();
		return ResponseEntity.status(HttpStatus.OK).body(addressEntity);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> DeleteAddressByEmployeeId(@PathVariable int id)
	{
		addressService.deleteEmployeeByEmployee(id);
		return ResponseEntity.ok("Entity deleted");
	}
}
