package com.retailstore.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.retailstore.model.Products;



public interface IProductRepository extends JpaRepository<Products,Long>{

	

}
