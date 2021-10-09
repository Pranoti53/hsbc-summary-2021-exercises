package com.hsbc.day2;

public class Current extends Account {
	private String nomineeName;

	public Current() {

	}

	public Current(String accountNo, double balance, String ifscCode, String nomineeName) {
		super(accountNo, balance, ifscCode);
		this.nomineeName = nomineeName;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String accountDisplay() {
		return "[accountNo=" + getAccountNo() + ", balance=" + getBalance() + ", ifscCode=" + getIfscCode()
				+ " nomineeName= " + nomineeName + "]";
	}

}
