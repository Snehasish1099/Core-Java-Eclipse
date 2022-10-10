package com.demo;

import java.util.Scanner;

public class Palindrome {

	static boolean checkPalindrome(String str) {
		boolean status;
		char ch[] = str.toCharArray();
		String revString = " ";

		for (int i = ch.length - 1; i >= 0; i--) {
			revString += ch[i];
		}
		int flag = str.compareTo(revString);
		if (flag == 0)
			status = true;
		else
			status = false;
		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();

		boolean check = checkPalindrome(s);
		if (check)
			System.out.println("The string is a palindrome: ");
		else
			System.out.println("The string is not a palindrome: ");

		sc.close();
	}
}
