package com.example.restapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class obj33 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int increment_id;
	
	private String magento_item_id;
	private String shipment_state;
	private String shipment_status;
	private String product_id;
	
	
	
	
	
	public obj33() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	public obj33(int increment_id, String magento_item_id, String shipment_state, String shipment_status,
			String product_id) {
		super();
		this.increment_id = increment_id;
		this.magento_item_id = magento_item_id;
		this.shipment_state = shipment_state;
		this.shipment_status = shipment_status;
		this.product_id = product_id;
	}







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
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	@Override
	public String toString() {
		return "Uworders [increment_id=" + increment_id + ", magento_item_id=" + magento_item_id + ", shipment_state="
				+ shipment_state + ", shipment_status=" + shipment_status + ", product_id=" + product_id + "]";
	}
	
	
	
	
	

}
