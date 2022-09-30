package com.inherit;

public class Cycle {

	//
	private String wheels;
	private double price;
	private String brand;

	// constructor
	public Cycle(String wheels, double price, String brand) {
		super();
		this.wheels = wheels;
		this.price = price;
		this.brand = brand;
	}

	// getter & setter
	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Cycle [wheels=" + wheels + ", price=" + price + ", brand=" + brand + "]";
	}

}
