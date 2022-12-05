package com.nt.beans;

public class Aadhardetails {
	private long aadharNo;
	private int age;
	private long mobileNo;
	
	public Aadhardetails(long aadharNo, int age, long mobileNo) {
		System.out.println("Aadhardetails.Aadhardetails()");
		this.aadharNo = aadharNo;
		this.age = age;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Aadhardetails [aadharNo=" + aadharNo + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
}
