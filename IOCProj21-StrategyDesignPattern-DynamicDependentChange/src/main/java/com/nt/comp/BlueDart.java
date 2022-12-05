package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements Courier {
	public BlueDart(){
		System.out.println("Bluedart 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid+" order is assign to bluedart for delivery";
	}
	
}
