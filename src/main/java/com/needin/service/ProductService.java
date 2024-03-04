package com.needin.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.needin.exception.ProductException;
import com.needin.model.Product;
import com.needin.request.CreateProductRequest;
import com.needin.user.domain.ProductSubCategory;

public interface ProductService {
	
	// only for admin
	public Product createProduct(CreateProductRequest req) throws ProductException;
	
	public String deleteProduct(Long productId) throws ProductException;
	
	public Product updateProduct(Long productId,Product product)throws ProductException;
	
	public List<Product> getAllProducts();
	
	// for user and admin both
	public Product findProductById(Long id) throws ProductException;
	
	public List<Product> findProductByCategory(String category);
	
	public List<Product> searchProduct(String query);
	
//	public List<Product> getAllProduct(List<String>colors,List<String>sizes,int minPrice, int maxPrice,int minDiscount, String category, String sort,int pageNumber, int pageSize);
	public Page<Product> getAllProduct(String category,  List<String> times, Integer minPrice, Integer maxPrice, Integer minDiscount,String sort, String stock, Integer pageNumber, Integer pageSize);
	
	
	
	

}
