package com.springcore.autowiring.annotation;

public class Address {
	private int streetNo;
	private String streetName;
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", streetName=" + streetName + "]";
	}
	
	

}
