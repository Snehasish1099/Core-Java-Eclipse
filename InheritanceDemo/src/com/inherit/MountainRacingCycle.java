package com.inherit;

public class MountainRacingCycle extends MountainCycle {

	//
	private boolean GPS;
	private String speedBooster;

	//
	public MountainRacingCycle(String wheels, double price, String brand, String gears, int speed, boolean gPS,
			String speedBooster) {
		super(wheels, price, brand, gears, speed);
		GPS = gPS;
		this.speedBooster = speedBooster;
	}

	//
	public boolean isGPS() {
		return GPS;
	}

	public void setGPS(boolean gPS) {
		GPS = gPS;
	}

	public String getSpeedBooster() {
		return speedBooster;
	}

	public void setSpeedBooster(String speedBooster) {
		this.speedBooster = speedBooster;
	}

	@Override
	public String toString() {
		return "MountainRacingCycle [GPS=" + GPS + ", speedBooster=" + speedBooster + ", toString()=" + super.toString()
				+ "]";
	}

}
