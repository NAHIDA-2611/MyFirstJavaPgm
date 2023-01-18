package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
		System.out.println("Default Constructor of Circle");
	}
	
public Circle(int size) {
	// Super is written by default with no arguments that's why this was not called
	super(size);
	System.out.println("Param Constructor Of Circle");
	System.out.println("Size ::" + size);
}
	
//	@Override
//	public void draw() {
//		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOO");
//			}

	public void print() {
	System.out.println("Print of circle");
	}

}
