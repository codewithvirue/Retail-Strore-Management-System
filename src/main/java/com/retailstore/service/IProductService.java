package com.retailstore.service;


import java.util.List;

import com.retailstore.exception.ProductNotFoundException;
import com.retailstore.model.Products;


public interface IProductService {

	List<Products> getAllProducts();
	Products saveProducts(Products products);

	Products getProductsById(long products_id) throws ProductNotFoundException;
	Products updateProducts(Products products);
	
	void deleteProductsById(long products_id)throws ProductNotFoundException;

}

