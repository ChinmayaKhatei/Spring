package com.dw.test;

import java.sql.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.Employee;

public class PropertiesFileTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Employee emp=ctx.getBean("emp",Employee.class);
		//display data
		System.out.println("emp data:"+emp);
		
		Environment env=ctx.getEnvironment();
		System.out.println(env.getProperty("emp.id"));
		System.out.println("---------");
		System.out.println(System.getProperties());
		
		System.out.println("---------");
		Date date=ctx.getBean("dt",Date.class);
		ctx.close();
	}

}
