package com.demo;

public class Address {

	// variable instances
	private String address1;
	private String city;
	private int pincode;
	private String state;
	private String country;

	// constructor
	public Address(String address1, String city, int pincode, String state, String country) {
		super();
		this.address1 = address1;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	// getter and setter
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
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

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", city=" + city + ", pincode=" + pincode + ", state=" + state
				+ ", country=" + country + "]";
	}

}
