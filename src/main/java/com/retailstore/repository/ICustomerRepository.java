package com.retailstore.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailstore.model.Customer;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
	
	
}
