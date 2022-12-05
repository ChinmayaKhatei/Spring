package com.dw.beans;
import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessage-0 param constructor");
	}
	
	public void setDate(Date date) {
		this.date=date;
	}
	
	public String generateWishMessage(String name) {
		System.out.println("Message Generator Method");
		int hour=date.getHours();
		if(hour<12)
			return "Good morning "+name;
		else if(hour<16)
			return "Good afternoon "+name;
		else if(hour<18)
			return "Good evening "+name;
		else
			return "Good night "+name;
		
	}
}
