package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements Courier {

	public DHL() {
		System.out.println("DHL:0-PARAM CONSTRUCTOR");
	}
	
	@Override
	public String deliver(int oid) {
		
		return oid+"order is assign to dhl for delivery";
	}

}
