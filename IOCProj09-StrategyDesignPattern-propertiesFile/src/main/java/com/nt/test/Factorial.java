package com.nt.test;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
