package com.nt.beans;

public class Person {
	private String name;
	private String address;
	private Aadhardetails aadhar;
	
	
	public Person(String name, String address, Aadhardetails aadhar) {
		System.out.println("person:3-param constructor");
		this.name = name;
		this.address = address;
		this.aadhar = aadhar;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", aadhar=" + aadhar + "]";
	}
	
	
}
