package com.retailstore.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.retailstore.model.Retailer;

public interface IRetailerRepository extends JpaRepository<Retailer,Long>{
	
	
	

}

