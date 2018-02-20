package com.ModelMadness;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ModelMadness.dao.CartDao;
import com.ModelMadness.model.Cart;

public class CartTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static CartDao cartDao;
	
	@Autowired
	static Cart cart;
	
	
	
	@BeforeClass
	public static void initialize(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		cartDao=(CartDao)context.getBean("cartDao");
		cart=context.getBean(Cart.class);
		
	}
	@Ignore
	@Test
	public void createCartTest(){
		cart.setCatid(121);
		cart.setProdPrice(2635.88);
		cart.setProductId(12);
		cart.setUserid("sowmya");
		boolean flag=cartDao.insert(cart);
		System.out.println("insertion of cart is done successfully");
		assertEquals("CartTestCase",true,flag);
		
	}
	

}
