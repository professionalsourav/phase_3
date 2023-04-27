package com.restapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.restapi.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	public Product findById(int id); 
	public List<Product> findByBrand(String brand);
	public List<Product> findBySeason(String season);
	public List<Product> findByCatagory(String catagory);
	public List<Product> findByPrice(int price);
	public List<Product> findByColor(String color);
	public List<Product> findTop3ByOrderByPriceDesc();
	public List<Product> findTop3ByOrderByPriceAsc();
	
}
