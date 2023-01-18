package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerServiceInterface {
	
	public interface CustomerRepositoryInterface {
		public boolean addNewCustomer(Customer customer);
		public Customer getCustomerByCustomerId(int customerId);  //read one
		public List<Customer> getAllCustomer();
		public boolean updateCustomerByCustomerId(Customer customer);
		public boolean deleteCustomerByCustomerId(int cystomerId);
		
		
		

	}

}
