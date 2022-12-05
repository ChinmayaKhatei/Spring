package com.nt.comp;

public final class BlueDart implements Courier {
	public BlueDart(){
		System.out.println("Bluedart 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid+"";
	}
	
}
