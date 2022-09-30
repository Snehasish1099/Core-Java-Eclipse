package com.superex;

public class Tiger {

	//
	private String breed;
	private String colour;

	//
	public Tiger(String breed, String colour) {
		super();
		this.breed = breed;
		this.colour = colour;
	}

	//
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Tiger [breed = " + breed + ", colour = " + colour + "]";
	}

}
