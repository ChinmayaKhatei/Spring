package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Autowired
	@Qualifier("dPartner")
	private Courier courier;

	
	public Flipkart() {
		System.out.println("flipkart 0-param constructor");;
	}
	
	public String shopping(String items[],double prices[]) {
		System.out.println("Flipkart shopping ");
		double billAmt=0.0;
		for(double p:prices) {
			billAmt+=p;
		}
		
		//generate order id
		int oid=new Random().nextInt(10000);
		
		//use courier
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+"  are purachased having bill amount "+billAmt+"-------->"+msg;
	}
}
