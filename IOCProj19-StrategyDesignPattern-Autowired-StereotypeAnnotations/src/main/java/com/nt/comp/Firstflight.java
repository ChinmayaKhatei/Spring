package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("fFlight")
public class Firstflight implements Courier {
	
	public Firstflight() {
		System.out.println("Firstflight:0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+"order is delivered by Firstflight";
	}

}
