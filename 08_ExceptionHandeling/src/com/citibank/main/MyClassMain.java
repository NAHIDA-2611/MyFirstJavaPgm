package com.citibank.main;

import java.util.InputMismatchException;

import com.citibank.main.domain.MyClass;

public class MyClassMain {
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		MyClass myclass = new MyClass();
		try {
		myclass.accept();
		myclass.calculate();
		myclass.display();
		} catch (InputMismatchException inputMismatchException )  {
	    
	    }
		
		System.out.println("Main Ends");
	}

}