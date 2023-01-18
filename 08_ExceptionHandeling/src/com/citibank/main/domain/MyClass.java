package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;
	
	public void accept() {
		//accept two number from user
		Scanner scanner = new Scanner(System.in);
		try {		
			System.out.println("Enter num1");
			num1 = scanner.nextDouble();
			System.out.println("Enter num2");
			num2 = scanner.nextDouble();
		} catch (InputMismatchException e )  {
			System.out.println("Invalid Input From User");
			System.out.println("Program will continue it's execution!!!");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception in code!!!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank You");
			scanner.close();
		}
			
}
	
	public void calculate()  {
		//calculate result = num1/num2
		System.out.println("Calculating Result"); 
		 result = (num1 / num2);  
	}
	
	public void display() {
		//print value of the display
		
		System.out.println("result = " + result );
		
	}
}
