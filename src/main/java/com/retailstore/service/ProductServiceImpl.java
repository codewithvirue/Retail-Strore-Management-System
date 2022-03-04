package com.retailstore.service;


import java.util.List;
import org.springframework.stereotype.Service;

import com.retailstore.exception.ProductNotFoundException;
import com.retailstore.model.Products;
import com.retailstore.repository.IProductRepository;


@Service
public class ProductServiceImpl implements IProductService {

	
	
	private IProductRepository productRepository;
	
	
	
	public ProductServiceImpl(IProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Products saveProducts(Products products) {
		// TODO Auto-generated method stub
		return productRepository.save(products);
	}

	@Override
	public Products getProductsById(long products_id)throws ProductNotFoundException {
		// TODO Auto-generated method stub
		 return productRepository.findById(products_id).get(); 
		
	
	}

	@Override
	public Products updateProducts(Products products) {
		// TODO Auto-generated method stub
		return productRepository.save(products);
	}

	@Override
	public void deleteProductsById(long products_id) {
		// TODO Auto-generated method stub
		
		productRepository.deleteById(products_id);
		
	}

}
