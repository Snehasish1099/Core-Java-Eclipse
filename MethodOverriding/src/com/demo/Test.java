package com.demo;

public class Test {

	public static void main(String[] args) {

		HDFCBank acc1 = new HDFCBank(false, 0, 0);
		acc1.setRateOfInterest();
		System.out.println("Rate for HDFC bank is: " + acc1.getRateOfInterest());

		SBIBank acc2 = new SBIBank(false, 0, 0);
		acc2.setRateOfInterest();
		System.out.println("Rate for SBI bank is: " + acc2.getRateOfInterest());

	}
}
