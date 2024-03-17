package com.spring.consinj;

public class Bill {
	private String billId;

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Bill(String billId) {
		super();
		this.billId = billId;
	}

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bill is: " + billId;
	}
	
}
