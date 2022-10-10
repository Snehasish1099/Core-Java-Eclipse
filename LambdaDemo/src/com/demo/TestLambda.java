package com.demo;

public class TestLambda {

	public static void main(String args[]) {
		Drawable d = new Drawable() {
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("I am drawing");
			}
		};
		d.draw();

		Drawable d1 = () -> {
			System.out.println("I am drawing Lambda");
		};
		d1.draw();
	}
}