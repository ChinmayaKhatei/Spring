package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return oid+"oreder id oreder is delivered by dtdc";
	}
	
}
