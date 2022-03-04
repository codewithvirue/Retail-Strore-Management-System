package com.retailstore.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.retailstore.model.Cart;


public interface ICartRepository extends JpaRepository<Cart,Long>{
	

}
