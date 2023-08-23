package com.example.test.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer personId;
	
	private String personnameString;
	private String personCityString;

	
	public Person(Integer personId, String personnameString, String personCityString) {
		super();
		this.personId = personId;
		this.personnameString = personnameString;
		this.personCityString = personCityString;
	}


	public Person() {
		
	}


	public Integer getPersonId() {
		return personId;
	}


	public void setPersonId(Integer personId) {
		this.personId = personId;
	}


	public String getPersonnameString() {
		return personnameString;
	}


	public void setPersonnameString(String personnameString) {
		this.personnameString = personnameString;
	}


	public String getPersonCityString() {
		return personCityString;
	}


	public void setPersonCityString(String personCityString) {
		this.personCityString = personCityString;
	}
	
	
	
	
	
}
