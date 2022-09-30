package com.demo;

public class Bank {

	private boolean netBanking;
	private int branches;
	protected double rateOfInterest;
	String name;

	public Bank(boolean netBanking, int branches, double rateOfInterest) {
		super();
		this.netBanking = netBanking;
		this.branches = branches;
		this.rateOfInterest = rateOfInterest;
	}

	public boolean isNetBanking() {
		return netBanking;
	}

	public void setNetBanking(boolean netBanking) {
		this.netBanking = netBanking;
	}

	public int getbranches() {
		return branches;
	}

	public void setbranches(int branches) {
		this.branches = branches;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest() {
		rateOfInterest = 0.0;
	}

	@Override
	public String toString() {
		return "Bank [netBanking=" + netBanking + ", branches=" + branches + ", rateOfInterest=" + rateOfInterest + "]";
	}
}
