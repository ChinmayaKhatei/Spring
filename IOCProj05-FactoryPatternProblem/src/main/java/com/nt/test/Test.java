package com.nt.test;

public class Test {
	static void m1(int a){
		System.out.println("before if");
		if(a==10) {
			System.out.println("in if");
			return;
		}
		System.out.println("after if");
		System.out.println("HI");
	}
	static int m2(int a) {
		System.out.println("before if");
		if(a==10) {
			System.out.println("in if");
			return a+10;
		}
		System.out.println("after if");
		System.out.println("HII");
		return 50;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(20);
		m1(10);
		m2(10);
		m2(20);
		
	}

}
