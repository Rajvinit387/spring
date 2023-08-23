package com.example.mongo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "students")
public class Student {
	
	
	private int id;
	
	private String nameString;
	
	private String cityString;

	public Student(int id, String nameString, String cityString) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.cityString = cityString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	
	
	
	

}
