package com.example.onetoone.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Address_student")
public class address {
	
	
	
	@Id
	private int address_id;
	
	
	private String  streetString;
	
	
	private String cityString;
	
	
	private String countryString;
	
	
	@ManyToOne
	@JoinColumn(name = "addressstudent")
	private Student student;


	public address(int address_id, String streetString, String cityString, String countryString) {
		super();
		this.address_id = address_id;
		this.streetString = streetString;
		this.cityString = cityString;
		this.countryString = countryString;
	}


	public address() {
		
		// TODO Auto-generated constructor stub
	}


	public int getAddress_id() {
		return address_id;
	}


	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}


	public String getStreetString() {
		return streetString;
	}


	public void setStreetString(String streetString) {
		this.streetString = streetString;
	}


	public String getCityString() {
		return cityString;
	}


	public void setCityString(String cityString) {
		this.cityString = cityString;
	}


	public String getCountryString() {
		return countryString;
	}


	public void setCountryString(String countryString) {
		this.countryString = countryString;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	 
	

}
