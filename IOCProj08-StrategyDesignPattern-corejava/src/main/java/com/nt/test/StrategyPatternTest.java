package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {
	public static void main(String[] args) {
		Flipkart fpkt=FlipkartFactory.getInstance("bluedart");
		String resultMsg=fpkt.shopping(new String[]{"candles", "flower","cake"},new double[] {100.0,200.0,300.0});
		System.out.println(resultMsg);
	}
}
