package com.example.restapi.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class obj11 {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int increment_id;
	public int getIncrement_id() {
		return increment_id;
	}
	public void setIncrement_id(int increment_id) {
		this.increment_id = increment_id;
	}
	public String getShell_id() {
		return shell_id;
	}
	public void setShell_id(String shell_id) {
		this.shell_id = shell_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String shell_id;
	private String address;
	@Override
	public String toString() {
		return "orders [increment_id=" + increment_id + ", shell_id=" + shell_id + ", address=" + address + "]";
	}
	public obj11(int increment_id, String shell_id, String address) {
		super();
		this.increment_id = increment_id;
		this.shell_id = shell_id;
		this.address = address;
	}
	public obj11() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
