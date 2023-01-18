package com.citibank.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {

	private List<Customer> customerList = new ArrayList<>();

	@Override
	public boolean addNewCustomer(Customer customer) {
		return customerList.add(customer);
	}

	public Customer getCustomerByCustomerID(int customerId)  {
	 	    
	    for (Customer customer : customerList)  {
	    	if (customer.getCutomerID() == customerId)   {
	        {
	            System.out.println(customer);
	            return customer;
	        }
	    }
	}    	
		return null;
	}

//	@Override
//	public List<Customer> getAllCustomer() {
//		return customerList;
//	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		for (Customer c : customerList) {
			if (c.getCutomerID() == customer.getCutomerID()) {
				c.setName(customer.getName());
				c.setCity(customer.getCity());
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int cystomerId) {
		for (Customer c : customerList) {
			if (c.getCutomerID() == cystomerId) {

			}
		}
		return false;
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
