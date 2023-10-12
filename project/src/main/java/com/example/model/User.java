package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
private String firstname;
private String lastname;
private String mobileNumber;
private String city;
private String state;
private String country;
private String pincode;

@OneToOne(targetEntity =RechargePlan.class, cascade = CascadeType.ALL )
private RechargePlan rechargePlan;

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public RechargePlan getRechargePlan() {
	return rechargePlan;
}

public void setRechargePlan(RechargePlan rechargePlan) {
	this.rechargePlan = rechargePlan;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname + ", mobileNumber="
			+ mobileNumber + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode
			+ ", rechargePlan=" + rechargePlan + "]";
}

}
