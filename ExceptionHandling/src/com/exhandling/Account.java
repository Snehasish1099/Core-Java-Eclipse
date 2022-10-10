package com.exhandling;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter balance:");

		int balance = sc.nextInt();

		if (balance < 1000) {
			extracted();
		}
		sc.close();
	}

	private static void extracted() throws CustomException {
		throw new CustomException();
	}

}
