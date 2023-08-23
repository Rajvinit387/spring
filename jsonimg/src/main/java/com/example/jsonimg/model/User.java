package com.example.jsonimg.model;

public class User {

	
	private int id;
	
	private String usernameString;
	
	
	private String cityString;


	public User(int id, String usernameString, String cityString) {
		super();
		this.id = id;
		this.usernameString = usernameString;
		this.cityString = cityString;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsernameString() {
		return usernameString;
	}


	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}


	public String getCityString() {
		return cityString;
	}


	public void setCityString(String cityString) {
		this.cityString = cityString;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", usernameString=" + usernameString + ", cityString=" + cityString + "]";
	}
	
	
	
	
	
	
	
}
