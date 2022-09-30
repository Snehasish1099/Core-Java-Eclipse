package com.superex;

public class Animal {

	// instance variable
	private String name;
	private String colour;

	// Constructor
	public Animal(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

	// getter & setter
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", colour=" + colour + "]";
	}

}
