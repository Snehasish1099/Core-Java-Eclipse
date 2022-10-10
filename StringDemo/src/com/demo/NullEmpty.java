package com.demo;

public class NullEmpty {

	static void changeString(StringBuffer s) {

		s = s.append("Hello");
		System.out.println("s is: " + s);
		s = null;// only deletes s1 as a reference s still remains

	}

	public static void main(String[] args) {

		StringBuffer str1 = new StringBuffer("No ");

		// System.out.println(s.length()); // Exception if null
		// System.out.println(str.length()); // length as 0 if empty
		changeString(str1);
		System.out.println("Original str: " + str1);

		String str2 = null;
		str2 = str2 + "A"; // null is given 4 bytes
		System.out.println("Length is " + str2.length());

		String str3 = "";
		str3 = str3 + "A"; // null is given 1 byte
		System.out.println("Length is " + str3.length());

	}
}
