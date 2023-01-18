package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class ArrayMain {

	public static void main(String[] args) {
		int [] numbers = new int[5];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		for (int i : numbers) {
			System.out.println(i);
			i = i +1;
			System.out.println(i);			
		}
		
		System.out.println("---------------------------");
		
		for (int i : numbers) {
			System.out.println(i);
			
		}
		
		System.out.println("-----------------------------");
		
		Employee [] allEmployees = new Employee[5];
		Scanner scanner = new Scanner(System.in);
		int employeeId;
		String name;
		double salary;
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter Employee ID");
			employeeId = scanner.nextInt();
			System.out.println("Enter Name");
			name = scanner.next();
			System.out.println("Enter Salary");
			salary = scanner.nextDouble();
			Employee employee = new Employee(employeeId, name, salary);
			allEmployees[i] = employee;
			System.out.println();
		}
		
		System.out.println("All Employee");
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
		
	}

}
