package com.example.model;

 import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column(name="sname")
	private String sname;
	
	@Column(name="sdept")
	private String sdept;
	@Column(name="sphone")
	private long sphone;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public long getSphone() {
		return sphone;
	}

	public void setSphone(long sphone) {
		this.sphone = sphone;
	}
	 
}
