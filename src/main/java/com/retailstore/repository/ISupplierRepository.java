package com.retailstore.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.retailstore.model.Supplier;


public interface ISupplierRepository extends JpaRepository<Supplier,Long>{

	
	
}
