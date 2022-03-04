package com.retailstore.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.retailstore.model.Order;


public interface IOrderRepository extends JpaRepository<Order,Long> {

}
