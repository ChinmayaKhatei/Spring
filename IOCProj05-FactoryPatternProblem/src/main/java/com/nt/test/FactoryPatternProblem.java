package com.nt.test;

import com.nt.beans.Aadhardetails;
import com.nt.beans.Customer;
import com.nt.beans.Employee;
import com.nt.beans.Person;
import com.nt.beans.Student;

public class FactoryPatternProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aadhardetails details=new Aadhardetails(12345l,25,700893693);//dependent obj
		Person emp=new Employee("dilu","hyd",details,101,"hcl",70000);
		System.out.println(emp);
		System.out.println("--------------------");
		Aadhardetails details1=new Aadhardetails(12789l,25,70090693);//dependent obj
		Person stud=new Student("dilu","hyd",details1,11,"java",2500);
		System.out.println(stud);
		System.out.println("--------------------");
		Aadhardetails details2=new Aadhardetails(45645l,15,890893693);//dependent obj
		Person cust=new Customer("dilu","hyd",details2,555,70000.0);
		System.out.println(cust);
		
	}

}
