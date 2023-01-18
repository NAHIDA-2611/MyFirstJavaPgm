package com.citibank.main.domain;

// Generalization 
public abstract class Shapes {
	public static Shapes shapes;
	public Shapes() {
		System.out.println("Default Constructor Of Shapes");
	}
public Shapes(int size) {
	System.out.println("Param Constructor Of Shapes");
	System.out.println("Size ::" + size);
}
	public void draw()
	{
		System.out.println("Drawing Shapes");
    }	
	public void convertShapes() {
	System.out.println("Converting Shapes");
	}
		
}
// }
