package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMainV2 {
	
	public static void main(String[] args)  {
		CustomerService customerService = new CustomerService();
		
		//add 5 customers 
		System.out.println("Adding Customers");
		
		Customer c1 = new Customer(1,"Nahida","Pune");
        Customer c2 = new Customer(2,"Quaser","Ranchi");
        Customer c3 = new Customer(3,"Aadloo","Banglore");
        Customer c4 = new Customer(4,"Beauty","Delhi");
        Customer c5 = new Customer(5,"Zeeniya","Kashmir");
	
	System.out.println("Adding First cust ::"  + customerService.addNewCustomer(c1));
	System.out.println("Adding Second cust ::"  + customerService.addNewCustomer(c2));
	System.out.println("Adding Third cust ::"  + customerService.addNewCustomer(c3));
	System.out.println("Adding Fourth cust ::"  + customerService.addNewCustomer(c4));
	System.out.println("Adding Fifth cust ::"  + customerService.addNewCustomer(c5));
	
	System.out.println("-----------------------------------------");
	System.out.println("Reading all customers from DB");
	
	List<Customer> customerList = customerService.getAllCustomer();
	for (Customer customer : customerList)   {
		System.out.println(customer);
	}
	
	System.out.println("-------------------------------------------");
	
	System.out.println("Read one cutomer from DB");
	Customer customer = customerService.getCustomerByCustomerId(101);
	System.out.println(customer);

	System.out.println("----------------------------------------------");
	System.out.println("Update customer details");
	Customer customerUpdated = new Customer(101, "Nahida", "Mumbai");
	boolean result = customerService.updateCustomerbyCustomerId(customerUpdated);
	
			if(result)
				System.out.println("Update Successfully");
			else
				System.out.println("No Customer Found");
			
	System.out.println("-----------------------------------------------");
	boolean customerdel = customerService.deleteCustomerByCustomerId(101);
	System.out.println(customer);
	
	System.out.println("-----------------------------------------");
	System.out.println("Delete Customer Details");
	Customer customerDeleted = new Customer();
	
	System.out.println("-----------------------------------------");
	System.out.println("Insert customer details");
	Customer customerInserted = new Customer(501, "jjfjf" , "polland");
	boolean result3 = customerService.updateCustomerbyCustomerId(customerInserted);
	
			if(result)
				System.out.println("Deleted Successfully");
			else
				System.out.println("Deletion Failed");
	
	}
	
	
	

}
