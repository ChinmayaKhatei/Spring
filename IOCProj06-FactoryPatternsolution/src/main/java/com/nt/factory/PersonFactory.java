package com.nt.factory;

import com.nt.beans.Aadhardetails;
import com.nt.beans.Customer;
import com.nt.beans.Employee;
import com.nt.beans.Person;
import com.nt.beans.Student;

//Factory Pattern
public class PersonFactory {
	//static factory method 
	public static Person getPerson(String type) {
		Person per=null;
		Aadhardetails details=null;
		if(type.equalsIgnoreCase("emp")) {
			details=new Aadhardetails(13245l,25,8749234);
			per=new Employee("raja","hyd",details,"hcl-101","hcl",57009);
		}
		else if(type.equalsIgnoreCase("cust")) {
			details=new Aadhardetails(13245l,35,8749234);
			per=new Customer("doe","UK",details,555,57009);
		}
		else if(type.equalsIgnoreCase("stud")) {
			details=new Aadhardetails(132498l,21,8749234);
			per=new Student("jhon","USA",details,101,"hcl",57);
		}
		else {
			throw new IllegalArgumentException("invalid person type");
		}
		return per;
		
	}//method
}//class
