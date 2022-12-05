package com.nt.test;

import java.lang.reflect.Constructor;

public class Reflection_Api_Instantiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c=Class.forName(args[0]); 
			Object obj1=c.newInstance();
			System.out.println(obj1.toString());
			System.out.println("--------------");
			
			Constructor cons[]=c.getDeclaredConstructors();
			Object obj2=cons[0].newInstance();
			System.out.println("obj2"+obj2.toString());
			System.out.println("-----------");
			Object obj3=cons[1].newInstance(10,20);
			System.out.println("obj3"+obj3.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
