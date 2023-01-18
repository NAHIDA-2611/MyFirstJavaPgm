package com.citibank.main.domain;

public class MyClass {
	public MyClass() {
		System.out.println("Defaut constructor of MyClass");
	// Default constructor	
	}
	
	public MyClass(int i) {
		System.out.println("Integer constructor of MyClass");
	}
	// can't have constructor with same int i argument , that's why we have 
	// arguments with 2 arguments
	public MyClass(int i, int j) {
		System.out.println("Integer 2 constructor of MyClass");
	}
	
	public MyClass(String s) {
		System.out.println("String constructor of MyClass");
	}
	
	public void show() {
		System.out.println("Hiiiii");
	// Hiiii Method	
	}
}
