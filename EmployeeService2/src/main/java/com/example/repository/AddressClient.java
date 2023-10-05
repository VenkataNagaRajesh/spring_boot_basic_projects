package com.example.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.response.AddressResponse;

@FeignClient(name="a",url="http://localhost:2022/")
public interface AddressClient {
	@GetMapping("/address/{id}")
	AddressResponse getAddressByEmployeeId(@PathVariable("id") int  id);
}