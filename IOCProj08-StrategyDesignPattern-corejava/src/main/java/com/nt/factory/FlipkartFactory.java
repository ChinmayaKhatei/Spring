package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

//factory class
public class FlipkartFactory {
	public static Flipkart getInstance(String courierType) {
		//dependent class obj
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		if(courierType.equalsIgnoreCase("bluedart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("invalid courier type");
		//target class
		Flipkart fpkt=new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
	}
}
