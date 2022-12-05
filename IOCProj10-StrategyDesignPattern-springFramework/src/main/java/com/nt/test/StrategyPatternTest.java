package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyPatternTest {
	public static void main(String[] args) {
		//hold the name and location of the propertied file
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/config/applicationContext.xml");
		
		Flipkart fpkt=factory.getBean("fpkt",Flipkart.class);
		String msg=fpkt.shopping(new String[] {"tshirt","pant","belt"},new double[] {600.0,1500.0,400.0});
		System.out.println(msg);
	}//main
}//class
	
