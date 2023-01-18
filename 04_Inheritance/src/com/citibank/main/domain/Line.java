package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		System.out.println("Default Constructor For Lines");
	}

public Line(int size) {
	System.out.println("Param Constructor Of Lines");
	System.out.println("Size ::" + size);
}
	@Override
	public void draw() {
		System.out.println("--------------------------");
	}

}
