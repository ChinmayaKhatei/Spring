package com.nt.test;

import com.nt.beans.Person;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {
	public static void main(String[] args) {
		//use factory to create employee obj
		Person emp=PersonFactory.getPerson("emp");
		System.out.println(emp);
		System.out.println("----------------");
		Person cust=PersonFactory.getPerson("cust");
		System.out.println(cust);
		System.out.println("-----------------");
		Person stud=PersonFactory.getPerson("stud");
		System.out.println(stud);
	}

}
