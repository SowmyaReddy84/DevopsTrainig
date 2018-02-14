package com.ModelMadness;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ModelMadness.dao.SupplierDao;
import com.ModelMadness.model.Supplier;




public class SupplierTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static SupplierDao supplierDao;
	
	@Autowired
	static Supplier supplier;
	
	@BeforeClass
	public static void initialize(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.ModelMadness.*");
		context.refresh();
		supplierDao=(SupplierDao)context.getBean("supplierD");
		supplier=context.getBean(Supplier.class);
		
		
	}
	@Ignore
	@Test
	public void createSupplierTestCase(){
		supplier.setSid("1013");
	
		supplier.setMobile("9502673234");
		supplier.setSname("sujika");
		supplier.setPassword("sujika");
		supplier.setRole("ROLE_SUPPLIER");
		boolean flag=supplierDao.saveOrUpdate(supplier);
		System.out.println("insertion of supplier Details completed");
		assertEquals("SupplierTestCase",true,flag);
		
	}
	
	@Ignore
	@Test
	public void deleteSupplierTest(){
		Supplier supplier=(Supplier)supplierDao.getSupplier("1013");
		boolean flag=supplierDao.delete(supplier);
		assertEquals("SupplierTestCase",true,flag);
	}
	

}
