package com.nt.beans;

public class Employee extends Person{
	private String empId;
	private String company;
	private double salary;
	
	
	public Employee(String name,String address,Aadhardetails aadhar,String empId, String company, double salary) {
		super(name,address,aadhar);
		System.out.println("Employee.6-param constructor");
		this.empId = empId;
		this.company = company;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return super.toString()+"Employee [empId=" + empId + ", company=" + company + ", salary=" + salary + "]";
	}
	
	
}
