package com.psk.oops;

public class ParentChildClient {

	public static void main(String[] args) {

		//case 1
		Parent parent = new Parent();
		parent.m1();
		
		//case 2
		Child child = new Child();
		child.m2();
		child.m1();
		
		//case 3
		Parent parent2 = new Child();
		parent2.m1();
	}

}
