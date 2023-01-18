package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		MyClass myClass = new MyClass();
		// Hiiii will printed 
		myClass.show();
		System.out.println("-----------------------");
	//	new MyClass();
	// combined line number 9 & 11	
		new MyClass().show();
		System.out.println("-----------------------");
		new MyClass(26);
		System.out.println("-----------------------");
		new MyClass(26,11);
		System.out.println("-----------------------");
		new MyClass("");
		System.out.println("Main Ends");

	}

}
