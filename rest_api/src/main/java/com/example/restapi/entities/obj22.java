package com.example.restapi.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class obj22 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int increment_id;
	
	private String magento_item_id;
	private String shipment_state;
	private String shipment_status;
	private String shell_id;
	private String address;
	public int getIncrement_id() {
		return increment_id;
	}
	public void setIncrement_id(int increment_id) {
		this.increment_id = increment_id;
	}
	public String getMagento_item_id() {
		return magento_item_id;
	}
	public void setMagento_item_id(String magento_item_id) {
		this.magento_item_id = magento_item_id;
	}
	public String getShipment_state() {
		return shipment_state;
	}
	public void setShipment_state(String shipment_state) {
		this.shipment_state = shipment_state;
	}
	public String getShipment_status() {
		return shipment_status;
	}
	public void setShipment_status(String shipment_status) {
		this.shipment_status = shipment_status;
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
	@Override
	public String toString() {
		return "osi [increment_id=" + increment_id + ", magento_item_id=" + magento_item_id + ", shipment_state="
				+ shipment_state + ", shipment_status=" + shipment_status + ", shell_id=" + shell_id + ", address="
				+ address + "]";
	}
	public obj22(int increment_id, String magento_item_id, String shipment_state, String shipment_status, String shell_id,
			String address) {
		super();
		this.increment_id = increment_id;
		this.magento_item_id = magento_item_id;
		this.shipment_state = shipment_state;
		this.shipment_status = shipment_status;
		this.shell_id = shell_id;
		this.address = address;
	}
	public obj22() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
