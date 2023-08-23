package com.example.jsonimg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Userg {
	
	@Id
	@Column(name="id")
	private int id;
	
	
	@Column(name="city")
	private String cityString;
	
	
	@Column(name="name")
	private String nameString;


	public Userg() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Userg(int id, String cityString, String nameString) {
		super();
		this.id = id;
		this.cityString = cityString;
		this.nameString = nameString;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCityString() {
		return cityString;
	}


	public void setCityString(String cityString) {
		this.cityString = cityString;
	}


	public String getNameString() {
		return nameString;
	}


	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	
	
	
}