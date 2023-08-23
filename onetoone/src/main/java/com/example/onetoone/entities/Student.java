package com.example.onetoone.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_student")
public class Student {
	
	@Id
	private int Studentid;
	private String studentnameString;
	private String aboutString;
	
	
	public List<address> getAddress() {
		return address;
	}


	public void setAddress(List<address> address) {
		this.address = address;
	}


	@OneToOne(mappedBy = "student",cascade=CascadeType.ALL)
	private Laptop laptop;
	
	
	
	@OneToMany(mappedBy = "student",cascade=CascadeType.ALL)
	private List<address> address= new ArrayList<>();


	
	
	
	
	public Student(int studentid, String studentnameString, String aboutString, Laptop laptop) {
		super();
		Studentid = studentid;
		this.studentnameString = studentnameString;
		this.aboutString = aboutString;
		this.laptop = laptop;
	}


	public int getStudentid() {
		return Studentid;
	}


	public void setStudentid(int studentid) {
		Studentid = studentid;
	}


	public String getStudentnameString() {
		return studentnameString;
	}


	public void setStudentnameString(String studentnameString) {
		this.studentnameString = studentnameString;
	}


	public String getAboutString() {
		return aboutString;
	}


	public void setAboutString(String aboutString) {
		this.aboutString = aboutString;
	}


	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

}
