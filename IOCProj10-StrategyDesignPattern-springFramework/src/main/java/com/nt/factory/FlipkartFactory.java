package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

//factory class
public class FlipkartFactory {
	private static Properties props;
	static {
		try {
		//locate properties file through stream
		InputStream is=new FileInputStream("src/main/java/com/nt/commons/info.properties");
		//load properties file content to java.util.properties class obj
		props=new Properties();
		props.load(is);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//static
	
	//static factory method
	public static Flipkart getInstance()throws Exception {
		//get dependent class name
		String courierClassName=props.getProperty("courier.classname");
		//load the dependent class name
		Class c=Class.forName(courierClassName);
		//create object for loaded class
		Constructor<Courier> cons[]=c.getDeclaredConstructors();
		Courier courier=cons[0].newInstance();
	
		//target class obj
		Flipkart fpkt=new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
	}
}
