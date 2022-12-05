package com.dw.test;

import java.lang.reflect.Constructor;
import java.lang.Class;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;//(ctrl+shift+o)

import com.dw.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemResource res=new FileSystemResource("src/main/java/com/dw/cfg/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("wmg");
		
		//setter Injection
		WishMessageGenerator gen=(WishMessageGenerator)obj;
		String msg=gen.generateWishMessage("chinmaya");
		System.out.println(msg);
		
		//constructor Injection
//		Class c=Class.forName("java.util.Date");
//		Constructor cons[]=c.getDeclaredConstructors();
//		java.util.Date dt=(java.util.Date)cons[0].newInstance();
	}

}
