package com.demo;

public interface Drawable {

	public void draw();

	// public void print();

	default void sayShape() {
		System.out.println("Shapes");
		method1();
	}

	private void method1() {
		System.out.println("Method 1");
	}

}
