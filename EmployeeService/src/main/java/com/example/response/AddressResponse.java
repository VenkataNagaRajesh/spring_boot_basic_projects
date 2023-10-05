package com.example.response;

import lombok.Data;

@Data
public class AddressResponse {

	private int id;
	private String line1;
	private String line2;
	private long zip;
	private String state;

	
	
}
