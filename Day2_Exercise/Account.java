package com.hsbc.day2;

public class Account {
	private String accountNo;
	private double balance;
	private String ifscCode;

	public Account() {

	}

	public Account(String accountNo, double balance, String ifscCode) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.ifscCode = ifscCode;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String accountDisplay() {
		return "[accountNo=" + accountNo + ", balance=" + balance + ", ifscCode=" + ifscCode + "]";
	}

}
