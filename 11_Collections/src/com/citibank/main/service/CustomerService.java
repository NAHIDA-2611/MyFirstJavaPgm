package com.citibank.main.service; 

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository; 
import com.citibank.main.repository.CustomerRepositoryInterface;

public class CustomerService implements CustomerServiceInterface {

//	private CustomerRepositoryInterface customerRepository = new CustomerRepository();
    private CustomerRepositoryInterface customerRepository = (CustomerRepositoryInterface) new CustomerRepository();

    public boolean addNewCustomer(Customer customer) {
       // logging
       // Authentication
        return customerRepository.addNewCustomer(customer);
    }

 

    public Customer getCustomerByCustomerId(int customerId) {
        
        return customerRepository.getCustomerByCustomerId(customerId);
    }

 

    public List<Customer> getAllCustomer() {
        
        return customerRepository.getAllCustomer();
    }

 

    public boolean updateCustomerbyCustomerId(Customer customer) {
        
        return customerRepository.updateCustomerByCustomerId(customer);
    }

 

    public boolean deleteCustomerByCustomerId(int customerId) {
        
        return customerRepository.deleteCustomerByCustomerId(customerId);
    }

 

}