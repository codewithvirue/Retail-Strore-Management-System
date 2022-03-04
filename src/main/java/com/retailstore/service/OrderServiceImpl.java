package com.retailstore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailstore.model.Order;
import com.retailstore.model.UserDetails;
import com.retailstore.repository.IOrderRepository;
import com.retailstore.repository.IUserDetailsRepository;


@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderRepository orderRepository;
	
	@Autowired
	private IUserDetailsRepository userDetailRepository;
	
	public OrderServiceImpl(IOrderRepository orderRepository,IUserDetailsRepository userDetailRepository) {
		super();
		this.orderRepository = orderRepository;
		this.userDetailRepository=userDetailRepository;
	}


	@Override
	public void addStore(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}


	@Override
	public void addStore(long user_id) {
		// TODO Auto-generated method stub
	UserDetails userDetails=userDetailRepository.findById(user_id).get();
		Order order=new Order();
		order.setUserDetails(userDetails);
		order.setStatus("ordered , cash and delivery");
		addStore(order);
		}

}
