package com.demo;

public class SBIBank extends Bank {

	public SBIBank(boolean netBanking, int branches, double rateOfInterest) {
		super(netBanking, branches, rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setRateOfInterest() {
		this.rateOfInterest = 4.5;
		this.name = "SBI";
	}

}
