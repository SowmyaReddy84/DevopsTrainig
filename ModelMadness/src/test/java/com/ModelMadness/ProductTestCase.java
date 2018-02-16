package com.ModelMadness;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ModelMadness.dao.ProductDao;
import com.ModelMadness.model.Product;




public class ProductTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static ProductDao productDao;
	
	@Autowired
	static Product product;
	
	@BeforeClass
	public static void initialize(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		productDao=(ProductDao)context.getBean("productDao");
		product=context.getBean(Product.class);
		
		
	}
	
	@Ignore
	@Test
	public void createProductTestCase(){
		product.setPid(1);
		product.setPrice(5263.00);
		product.setPname("TOPS");
		product.setStock(120);
	
		boolean flag=productDao.insert(product);
		System.out.println("insertion is completed");
		assertEquals("ProductTestCase",true,flag);
		
		
		
	}
	
	

}
