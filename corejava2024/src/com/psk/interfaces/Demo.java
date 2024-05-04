package com.psk.interfaces;

public class Demo {
	
	public String m1() {
		
		return "Hi good morning all..";
	}
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		String message = demo.m1();
		
		System.out.println(message);	

	}

}
