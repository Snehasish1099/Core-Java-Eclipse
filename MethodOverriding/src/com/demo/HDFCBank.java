package com.demo;

public class HDFCBank extends Bank {

	public HDFCBank(boolean netBanking, int branches, double rateOfInterest) {
		super(netBanking, branches, rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setRateOfInterest() {
		this.rateOfInterest = 9.5;
		this.name = "HDFC";
	}

}
