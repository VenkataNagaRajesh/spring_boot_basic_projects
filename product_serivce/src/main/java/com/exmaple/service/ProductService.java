package com.exmaple.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.exmaple.entity.Product;
import com.exmaple.repository.ProductRepository;

@Service
public class ProductService implements IProductService{

	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public void createproduct(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public void updateproduct(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public void deleteproduct(Integer id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Product getProduct(Integer id) {
			Optional<Product> product= productRepository.findById(id);
			return product.get();
	}

	public List<Product> getAllProducts() {
		
		List<Product> productlist=productRepository.findAll();
		return productlist;
	}

}
