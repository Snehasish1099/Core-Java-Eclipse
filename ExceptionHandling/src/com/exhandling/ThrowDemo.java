package com.exhandling;

import java.util.Scanner;

public class ThrowDemo {

	static void check(int age) {
		try {
			if (age < 18)
				throw new Exception("No");
			else
				System.out.println("Yes");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Age: ");
		int age = sc.nextInt();
		check(age);
		sc.close();
	}
}