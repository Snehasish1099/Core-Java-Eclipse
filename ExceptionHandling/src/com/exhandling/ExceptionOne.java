package com.exhandling;

public class ExceptionOne {

	public static void main(String args[]) {
		try {
			int a[] = new int[10];
			a[11] = 9;
		} catch (Exception e) {
			System.out.println("Exception found" + e);
		}
	}
}
