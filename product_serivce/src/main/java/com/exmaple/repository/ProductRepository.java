package com.exmaple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exmaple.entity.Product;
import com.exmaple.service.IProductService;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{

}
