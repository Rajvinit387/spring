package com.example.onetoone.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Laptop {
	
	@Id
	private  int laptop_id;
	
	private String brandnoString;
	
	private String modelString;
	
	@OneToOne
	@JoinColumn(name="Student_id")
	private Student student;

	public Laptop(int laptop_id, String brandnoString, String modelString, Student student) {
		super();
		this.laptop_id = laptop_id;
		this.brandnoString = brandnoString;
		this.modelString = modelString;
		this.student = student;
	}

	public Laptop() {
		
		// TODO Auto-generated constructor stub
	}

	public int getLaptop_id() {
		return laptop_id;
	}

	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}

	public String getBrandnoString() {
		return brandnoString;
	}

	public void setBrandnoString(String brandnoString) {
		this.brandnoString = brandnoString;
	}

	public String getModelString() {
		return modelString;
	}

	public void setModelString(String modelString) {
		this.modelString = modelString;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	
	
	
	
	
	

}
