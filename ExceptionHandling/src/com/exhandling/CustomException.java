package com.exhandling;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	public CustomException() {
		System.out.println("Low balance");
	}
}
