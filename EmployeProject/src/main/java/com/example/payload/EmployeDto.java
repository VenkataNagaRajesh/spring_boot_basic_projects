package com.example.payload;

import lombok.Data;

@Data
public class EmployeDto {

	private long id;
	private String employeName;
	private String eMail;
	private String employeBaseLocation;
	private long projectCode;
	private String projectName;
	
}
