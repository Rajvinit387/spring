package com.example.servervalidation.entity;

import javax.crypto.KeyAgreement;

import org.hibernate.validator.resourceloading.AggregateResourceBundleLocator.AggregateBundle;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class LoginData {
	
	
	@NotBlank(message="user name cannot be empty")
	@Size(min =3, max=12, message = "must be between these")
 private String usetnameString;
	
	
@NotBlank(message = "SHOULD NOT BE EMPTY")
@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "invalid mail")
 private String useremailString;
	
public boolean isAgreement() {
	return agreement;
}
public void setAgreement(boolean agreement) {
	this.agreement = agreement;
}
@AssertTrue(message = "must be checked")
private boolean agreement;
	
	
public LoginData(String usetnameString, String useremailString) {
	super();
	this.usetnameString = usetnameString;
	this.useremailString = useremailString;
}
public String getUsetnameString() {
	return usetnameString;
}
public void setUsetnameString(String usetnameString) {
	this.usetnameString = usetnameString;
}
public String getUseremailString() {
	return useremailString;
}
public LoginData() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "logindata [usetnameString=" + usetnameString + ", useremailString=" + useremailString + "]";
}
public void setUseremailString(String useremailString) {
	this.useremailString = useremailString;
}
}
