package com.day6.paginationandsorting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Baby {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String babyFirstName;
	private String babyLastName;
	private String fatherName;
	private String motherName;
	private String address;
	public Baby() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Baby(int id, String babyFirstName, String babyLastName, String fatherName, String motherName,
			String address) {
		super();
		this.id = id;
		this.babyFirstName = babyFirstName;
		this.babyLastName = babyLastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBabyFirstName() {
		return babyFirstName;
	}
	public void setBabyFirstName(String babyFirstName) {
		this.babyFirstName = babyFirstName;
	}
	public String getBabyLastName() {
		return babyLastName;
	}
	public void setBabyLastName(String babyLastName) {
		this.babyLastName = babyLastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
