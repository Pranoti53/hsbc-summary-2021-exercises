package com.hsbc.day2;

public class Savings extends Account {
	private double dailyLimit;

	public Savings() {
	}

	public Savings(String accountNo, double balance, String ifscCode, double dailyLimit) {
		super(accountNo, balance, ifscCode);
		this.dailyLimit = dailyLimit;
	}

	public double getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(double dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	public String accountDisplay() {
		return "[accountNo=" + getAccountNo() + ", balance=" + getBalance() + ", ifscCode=" + getIfscCode()
				+ " dailyLimit= " + dailyLimit + "]";
	}
}
