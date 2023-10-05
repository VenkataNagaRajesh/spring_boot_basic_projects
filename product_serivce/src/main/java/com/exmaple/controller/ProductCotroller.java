package com.exmaple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exmaple.entity.Product;
import com.exmaple.service.IProductService;

@RestController
@RequestMapping("/v1")
public class ProductCotroller {
	
	@Autowired
	IProductService productService;
	
	
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.GET,produces="application/json")
	public ResponseEntity<Product> getProduct(@PathVariable  Integer id)
	{
		Product product=productService.getProduct(id);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	@CrossOrigin
	@RequestMapping(value="/product",method=RequestMethod.GET,produces="application/json")
	public ResponseEntity<List<Product>> getProductAll()
	{
		List<Product> productlist=productService.getAllProducts();
		return new ResponseEntity<List<Product>>(productlist,HttpStatus.OK);
	}
	@RequestMapping(value="/product",method=RequestMethod.POST,produces="application/json",consumes="application/json")
	public ResponseEntity createProduct(Product p)
	{
		productService.createproduct(p);
		return new ResponseEntity<>("Product inserted successfully",HttpStatus.OK);
	}
	
	@RequestMapping(value="/product",method=RequestMethod.PUT,produces="application/json")
	public ResponseEntity updateProduct(Product p)
	{
		productService.updateproduct(p);
		return new ResponseEntity<>("Product update successfully",HttpStatus.OK);
	}
	
	@RequestMapping(value="/product",method=RequestMethod.DELETE,produces="application/json")
	public ResponseEntity deleteProduct(Integer id)
	{
		productService.deleteproduct(id);
		return new ResponseEntity<>("Product deleted Successfully",HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
