package com.inherit;

public class MountainCycle extends Cycle {

	//
	private String gears;
	private int speed;

	//
	public MountainCycle(String wheels, double price, String brand, String gears, int speed) {
		super(wheels, price, brand);
		this.gears = gears;
		this.speed = speed;
		// TODO Auto-generated constructor stub
	}

	//
	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "MountainCycle [gears=" + gears + ", speed=" + speed + ", toString()=" + super.toString() + "]";
	}

}
