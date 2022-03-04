package com.retailstore.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailstore.model.Customer;
import com.retailstore.repository.ICustomerRepository;


@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerRepository customerRepository;

	
	
	public CustomerServiceImpl(ICustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(long customer_id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customer_id).get();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(long customer_id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customer_id);
	}
	
	
	
	
	

}
