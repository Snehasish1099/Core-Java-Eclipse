package com.demo1;

public class Test {

	public static void main(String args[]) {

		// Lambda with one parameter and no return type
		MyName n1 = (name) -> {
			System.out.println("Hello " + name);
		};
		n1.printName("God");

		// Lambda with one parameter and return type
		MyName2 n2 = (name) -> {
			return name;
		};
		System.out.println("Hello " + n2.printName("Kami-sama"));

	}

}
