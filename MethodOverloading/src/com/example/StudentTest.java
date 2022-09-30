package com.example;

import java.util.Scanner;

public class StudentTest {
	static void displayStudents(Student[] s1) {

		for (Student obj : s1) {
			System.out.println("Name:" + obj.getName() + " Score:" + obj.getScore() + " Course:" + obj.getCourse());
		}

	}

	// method overloading
	static void displayStudents(Student[] s2, double marks) {

		for (Student obj : s2) {
			if (obj.getScore() >= marks)
				System.out.println("Name:" + obj.getName() + " Score:" + obj.getScore() + " Course:" + obj.getCourse());
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[3];
		s[0] = new Student(1, "Snehasish10", 23, 91.5, "MCA");
		s[1] = new Student(2, "Snehasish99", 21, 82.5, "B.Sc");
		s[2] = new Student(3, "Snehasish", 25, 99.9, "PhD");
		int ch;
		System.out.println("Enter 1 to see all students:");
		System.out.println("Enter 2 to see students above 90");
		System.out.println("Enter your choice:");
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			displayStudents(s);
			break;
		case 2:
			displayStudents(s, 90);
			break;
		default:
			System.out.println("Wrong input");

		}
		sc.close();
	}

}
