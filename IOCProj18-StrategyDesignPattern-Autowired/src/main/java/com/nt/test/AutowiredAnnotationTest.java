package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class AutowiredAnnotationTest {
	public static void main(String[] args) {
		//hold the name and location of the propertied file
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		String msg=fpkt.shopping(new String[] {"tshirt","pant","belt"},new double[] {600.0,1500.0,400.0});
		System.out.println(msg);
	}//main
}//class
	
