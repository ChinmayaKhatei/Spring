package com.dw.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;//(ctrl+shift+o)

import com.dw.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemResource res=new FileSystemResource("src/main/java/com/dw/cfg/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("wmg");
		WishMessageGenerator gen=(WishMessageGenerator)obj;
		String msg=gen.generateWishMessage("chinmaya");
		System.out.println(msg);
	}

}
