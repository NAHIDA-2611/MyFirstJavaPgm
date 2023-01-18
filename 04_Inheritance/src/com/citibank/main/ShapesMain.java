package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Triangle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;

public class ShapesMain {
	public static void main(String[] args) {
//		Circle circle = new Circle(26);
//		circle.draw();
		
//		Circle circle = new Circle();
//		circle.draw();
		
//		circle.print();
	
		Shapes shapes = new Circle();
//		shapes.draw();
//		shapes.print();
	}
	{	
	Scanner scanner = new Scanner(System.in);
	System.out.println("1.Circle 2.");
	System.out.println("Enter YOur Choice");
	int choice = scanner.nextInt();
	
	Shapes shapes = getShapes(choice);
	shapes.draw();
   }	
	public static Shapes getShapes(int choice) {
		if (choice ==1) {
			Shapes shapes = new Circle();
			return shapes;
		}
		if (choice ==2) {
			return new Triangle();
		}
		if (choice == 3) {
			return new Line();
		}
//		return new Shapes();
		return null;    // after adding abstract 
	}
	
}
