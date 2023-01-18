package com.citibank.main;

import com.citibank.main.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Nahida", 1000);
		Employee employee2 = new Employee(102, "Quaser", 2000);
		Employee employee3 = new Employee(103, "Aadloo", 3000);
		Employee employee4 = new Employee(104, "Zeeniya", 4000);
		Employee employee5 = new Employee(105, "Beauty", 5000);
		
		// need to do get operation for 15 times for all details 
	//	System.out.println(employee1.getEmployeeId());
		// this will give object address .. by default toString comes
	//	System.out.println(employee1.toString());
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
	}
}
