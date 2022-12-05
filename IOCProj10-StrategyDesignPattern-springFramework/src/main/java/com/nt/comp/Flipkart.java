package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	private Courier courier;

	
	public Flipkart() {
		System.out.println("flipkart 0-param constructor");;
	}


	public void setCourier(Courier courier) {
		System.out.println("fpkt setcourier");
		this.courier = courier;
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
