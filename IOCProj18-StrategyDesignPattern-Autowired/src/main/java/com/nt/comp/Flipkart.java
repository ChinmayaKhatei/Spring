package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	@Autowired
	@Qualifier("bDart")
	private Courier courier;

	
	public Flipkart(@Qualifier("fFlight")Courier courier) {
		this.courier=courier;
		System.out.println("flipkart 1-param constructor"+courier.getClass());;
	}
	
	
	@Autowired
	@Qualifier("dhl")
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()"+courier.getClass());
		this.courier=courier;
		System.out.println("Flipkart.setCourier()"+courier.getClass());
	}
	
	@Autowired
	@Qualifier("bDart")
	public void assign(Courier courier) {
		System.out.println("flipkart.assign()");
		this.courier=courier;
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
