package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInterface {

	private List<Customer> customerList = new ArrayList<>();

	private String sql;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultset;
	private int rowCount;
//
//	@Override
//	public boolean addNewCustomer(Customer customer) {
//		return customerList.add(customer);
//	}
//
//	public Customer getCustomerByCustomerID(int customerId) {
//
//		for (Customer customer : customerList) {
//			if (customer.getCutomerID() == customerId) {
//				{
//					System.out.println(customer);s
//					return customer;
//				}
//			}
//	}
//		return null;
//	}

//	@Override
//	public List<Customer> getAllCustomer() {
//		return customerList;
//	}

	@Override
	public List<Customer> getAllCustomer() {

		connection = new ConnectionFactory().getConnection();
		sql = "select * form customer_details";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				int customerId = resultset.getInt("customer_id)");
				String name = resultset.getString("name)");
				String address = resultset.getString("address)");

				Customer customer = new Customer(customerId, name, address);

				customerList.add(customer);
			}

		} catch (SQLException e) {
			System.out.println("Exception in query");
			System.out.println(e.getMessage());

		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return customerList;
	}

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
	public boolean addNewCustomer(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql = "insert into customer_details(name,address) values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,  customer.getName());
			preparedStatement.setString(2,  customer.getCity());
			
			rowCount = preparedStatement.executeUpdate();
			if (rowCount >0)
				return true;
		} catch (SQLException e) {
			System.out.println("Exception in query");
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		
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
//	public boolean deleteCustomerByCustomerId(int customerId) {
	
	
	public Customer getCustomerByCustomerId(int customerId) {	
		connection = new ConnectionFactory().getConnection();
		sql = "select * form customer_details";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			resultset = preparedStatement.executeQuery();
			if (resultset.next()) {
				customerId = resultset.getInt("customer_id)");
				String name = resultset.getString("name)");
				String address = resultset.getString("address)");

				Customer customer = new Customer(customerId, name, address);
			}
		} catch (SQLException e) {
			System.out.println("Exception in query");
			System.out.println(e.getMessage());

//		return customer;
		return null;	

		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return null;
	}
}		 

//	@Override
//	public Customer getCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public List<Customer> getAllCustomer() {
//		// TODO Auto-generated method stub
//		return null;



	@Override
	public boolean deleteCustomerByCustomerId(int cystomerId) {
		// TODO Auto-generated method stub
		return false;
	}
	}	