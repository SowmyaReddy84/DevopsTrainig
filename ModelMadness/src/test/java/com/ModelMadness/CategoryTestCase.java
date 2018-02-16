package com.ModelMadness;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ModelMadness.dao.CategoryDao;
import com.ModelMadness.model.Category;



public class CategoryTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static CategoryDao categoryDao;
	
	@Autowired
	static Category category;
	
	@BeforeClass
	public static void initialize(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		categoryDao=(CategoryDao)context.getBean("categoryDao");
		category=context.getBean(Category.class);
		
	}
	@Ignore
	@Test
	public void createCategoryTest(){
		category.setCid("s1100");
		category.setCname("HomeDecor");
		category.setDescription("Furnitures,wall stickers");
		boolean flag=categoryDao.save(category);
		System.out.println("Insertion of cattegory are done");
		assertEquals("CategoryTestCase",true,flag);
	}

}
