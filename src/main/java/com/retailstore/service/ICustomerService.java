package com.retailstore.service;


import java.util.List;

import com.retailstore.model.Customer;



public interface ICustomerService {

	List<Customer> getAllCustomers();
	Customer saveCustomer(Customer customer);

	Customer getCustomerById(long customer_id);
	Customer updateCustomer(Customer customer);
	
	void deleteCustomerById(long customer_id);
}

