package com.nt.beans;

public class Student extends Person{
	private int roll;
	private String course;
	private double fee;
	
	
	public Student(String name,String address,Aadhardetails aadhar,int roll, String course, double fee) {
		super(name,address,aadhar);
		System.out.println("student 6-param constructor");
		this.roll = roll;
		this.course = course;
		this.fee = fee;
	}


	@Override
	public String toString() {
		return super.toString()+"Student [roll=" + roll + ", course=" + course + ", fee=" + fee + "]";
	}
	
	
}
