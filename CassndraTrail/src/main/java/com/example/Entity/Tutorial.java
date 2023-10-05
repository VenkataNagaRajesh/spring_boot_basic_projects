package com.example.Entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Tutorial {

	@Id
	private UUID id;
	
	private String title;
	
	private String description;
	
	private boolean published;
	
	public boolean isPublished()
	{
		return published;
	}
}
