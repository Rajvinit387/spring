package com.example.apixl.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product {
	
	
	@Id
	private Integer id;
	
	public product(Integer id, String firstname, String secondname, String gender, String country, Integer age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.secondname = secondname;
		this.gender = gender;
		this.country = country;
		this.age = age;
	}
	private String firstname;
	private String secondname;
	private String gender;
	private String country;
	private Integer age;

	public product() {
	
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
	
	

}
