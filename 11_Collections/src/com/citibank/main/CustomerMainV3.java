package com.citibank.main;

import java.util.HashSet;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		
		Set<Customer> customerSet = new HashSet<>();
		
		Customer c1 = new Customer(1,"Nahida","Pune");
        Customer c2 = new Customer(2,"Quaser","Ranchi");
        Customer c3 = new Customer(3,"Aadloo","Banglore");
        Customer c4 = new Customer(4,"Beauty","Delhi");
        Customer c5 = new Customer(5,"Zeeniya","Kashmir");
        Customer c6 = new Customer(5,"Zeeniya","Kashmir");
        
        System.out.println("First Customer::"   + c1.hashCode());
        System.out.println("Adding First cust ::"  + customerSet.add(c1));
//    	System.out.println("Adding Second cust ::"  + customerSet.add(c2));
//    	System.out.println("Adding Third cust ::"  + customerSet.add(c3));
//    	System.out.println("Adding Fourth cust ::"  + customerSet.add(c4));
        System.out.println("Fifth Customer::"   + c5.hashCode());
    	System.out.println("Adding Fifth cust ::"  + customerSet.add(c5));
    	System.out.println("Sixth Customer::"   + c6.hashCode());
    	System.out.println("Adding Sixth cust ::"  + customerSet.add(c6));
//    	
    	System.out.println(customerSet);
    	
    	

	}

}
