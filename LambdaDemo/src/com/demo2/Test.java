package com.demo2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lambda with multiple parameters
		Add a1 = (a, b) -> {
			System.out.println((a + b));
			return 0;
		};
		a1.computeSum(9, 7);
	}
}
