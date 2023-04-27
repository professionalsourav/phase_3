package com.restapi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Product;
import com.restapi.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	private List<Product> brandList=null;
	
	
	
	@GetMapping("/product")
	public List<Product> getAllProducts()
	{
		List<Product> list =(List<Product>)this.productRepository.findAll();
		
		return list;
	}
	
	@GetMapping("/product/{productid}")
	public Product getProductById(@PathVariable("productid") int productid)
	{
		Product findById =this.productRepository.findById(productid);
		
		return findById;
	}
	
	// get product by brand name
	@GetMapping("/product/brand/{brandname}")
	public List<Product> getProductByBrand(@PathVariable("brandname") String brandname)
	{		
		List<Product> list =(List<Product>)this.productRepository.findByBrand(brandname);
		return list;		
	}
	
	@GetMapping("/product/Desc")
	public List<Product> getProductDescByPrice()
	{
		List<Product> findByPriceOrderByAscList = this.productRepository.findTop3ByOrderByPriceDesc();
	
		return findByPriceOrderByAscList;
	}
	
	
	@GetMapping("/product/asc")
	public List<Product> getProductAscByPrice()
	{
		List<Product> findByPriceOrderByAscList = this.productRepository.findTop3ByOrderByPriceAsc();
	
		return findByPriceOrderByAscList;
	}
	
	// get product by catagory
		@GetMapping("/product/catagory/{catagory}")
		public List<Product> getProductByCatagory(@PathVariable("catagory") String catagory)
		{		
			List<Product> list =(List<Product>)this.productRepository.findByCatagory(catagory);
			return list;		
		}
	
		// get product by season
				@GetMapping("/product/season/{season}")
				public List<Product> getProductBySeason(@PathVariable("season") String season)
				{		
					List<Product> list =(List<Product>)this.productRepository.findBySeason(season);
					return list;		
				}
	
			
				// get product by price
				@GetMapping("/product/price/{price}")
				public List<Product> getProductByPrice(@PathVariable("price") int price)
				{		
					List<Product> list =(List<Product>)this.productRepository.findByPrice(price);
					return list;		
				}
				
				// get product by color
				@GetMapping("/product/color/{color}")
				public List<Product> getProductByPrice(@PathVariable("color") String color)
				{		
					List<Product> list =(List<Product>)this.productRepository.findByColor(color);
					return list;		
				}
				
	// for add product with response body 			
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product)
	{
		Product addproduct = this.productRepository.save(product);
		return addproduct;
	}
	// delete a product from table by productid
	@DeleteMapping("/product/{productid}")
	public void deleteProduct(@PathVariable("productid") int productid )
	{
		this.productRepository.deleteById(productid);
	}
	// for update a product 
	@PutMapping("/product/{productid}")
	public Product updateProduct(@RequestBody Product product, @PathVariable("productid") int productid)
	{
		product.setProductid(productid);
		Product upadteProduct = this.productRepository.save(product);
		return upadteProduct;
		
	}
	
}
