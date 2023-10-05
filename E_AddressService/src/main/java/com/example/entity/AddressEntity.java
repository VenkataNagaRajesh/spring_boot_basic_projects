package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="address")
public class AddressEntity {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="line1")
	private String line1;
	@Column(name="line2")
	private String line2;
	@Column(name="zipcode")
	private long zip;
	@Column(name="state")
	private String state;

	
}
