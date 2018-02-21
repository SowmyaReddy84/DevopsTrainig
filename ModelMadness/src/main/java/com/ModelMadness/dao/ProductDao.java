package com.ModelMadness.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ModelMadness.model.Product;





public interface ProductDao {
	public boolean insert(Product product);
	public int saveOrUpdate(Product product);
	int deleteById(int productId);
	public List<Product> getAllProduct();
	public Product getProductId(int pid);
	
}
