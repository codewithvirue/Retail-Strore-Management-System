package com.retailstore.service;



import java.util.List;

import com.retailstore.model.Cart;


public interface ICartService {
	public void addProductToCart(Cart cart);
	public Cart addProductToCart(long products_id,long user_id) ;
	public List<Cart> findAll();

}

