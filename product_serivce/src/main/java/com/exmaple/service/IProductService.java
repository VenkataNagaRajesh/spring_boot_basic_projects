package com.exmaple.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.exmaple.entity.Product;


public interface IProductService{

		void createproduct(Product product);
		void updateproduct(Product product);
		void deleteproduct(Integer id);
		Product getProduct(Integer id);
		List<Product> getAllProducts();
		
}
