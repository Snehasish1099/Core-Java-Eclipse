package com.demo;

public class StudentDetails {

	static void display(Student s) {
		System.out.println("Id: " + s.getId() + ", Name: " + s.getName() + ", " + s.getAddress());
		// System.out.println(s);
	}

	public static void main(String args[]) {
		Student s1 = new Student(1, "Snehasish", new Address("5A", "Kolkata", 700006, "West", "India"));
		System.out.println("Details of the student(s) is/are: ");
		display(s1);
	}
}
