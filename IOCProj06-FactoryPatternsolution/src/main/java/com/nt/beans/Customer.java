package com.nt.beans;

public class Customer extends Person{
	private int txId;
	private double billAmt;
	
	public Customer(String name,String address,Aadhardetails aadhar,int txId, double billAmt) {
		super(name,address,aadhar);
		System.out.println("Customer 5-param constructor");
		this.txId = txId;
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return super.toString()+"Customer [txId=" + txId + ", billAmt=" + billAmt + "]";
	}
	
	
}
