package com.superex;

public class SuperDemo {

	public static void main(String args[]) {
		Tiger t = new Tiger("Royal Bengal Tiger", "Yellow with black stripes");
		System.out.println(t);

		t.setBreed("African Tiger");
		t.setColour("White with bluish-black stripes");
		System.out.println(t);
	}
}
