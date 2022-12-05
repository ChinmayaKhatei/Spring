package com.nt.beans;

public class Test {
	private int a;
	private int b;
	
	public Test() {
		System.out.println("test class 0-param constructor");
	}
	public Test(int a, int b) {
		System.out.println("test class 2-param constructor");
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
	
}
