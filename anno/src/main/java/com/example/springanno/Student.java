package com.example.springanno;

public class Student {
	
	
	String nameString;
	
	
	public Student(String nameString)
	{
		this.nameString=nameString;
	}

	
	public void studying()
	{
		System.out.println(this.nameString+"   studying");
	}


	public Student() {
		
		// TODO Auto-generated constructor stub
	}


	public String getNameString() {
		return nameString;
	}


	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
}
