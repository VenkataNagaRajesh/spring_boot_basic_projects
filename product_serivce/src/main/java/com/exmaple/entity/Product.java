package com.exmaple.entity;

import javax.persistence.Id;

@javax.persistence.Entity
@javax.persistence.Table
public class Product {

	@Id
	private Integer pid;
	private String pname;
	private Integer pcost;
	private String place;

	public Product() {

		// TODO Auto-generated constructor stub
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPcost() {
		return pcost;
	}

	public void setPcost(Integer pcost) {
		this.pcost = pcost;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
