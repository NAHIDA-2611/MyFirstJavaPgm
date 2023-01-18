package com.citibank.main;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMain {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		
		CustomerService customerService = new CustomerService();
		
		Customer customer = customerService.getAllCustomer();

			if(customer !=null) {
				System.out.println(customer);
			}
			else {
				System.out.println("No customer found");
			}

	}

}
