package com.ModelMadness;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ModelMadness.dao.UserDao;
import com.ModelMadness.dao.UserDetailDao;
import com.ModelMadness.model.UserDetail;

public class UserDetailsTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static UserDetailDao userDetailsDao;

	@Autowired
	static UserDetail userDetails;
	
	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();

		// get the userDAO from context
		// get the user from context

		userDetailsDao = (UserDetailDao) context.getBean("userDetailsDao");
		
		userDetails =context.getBean(UserDetail.class);

	}
	
	@Test
	public void createUserDetailsTestCase(){
		userDetails.setUserId("sowya@gmail.com");
		userDetails.setFirstname("sowmya");
		userDetails.setLastname("reddy");
		userDetails.setPincode(517325);
		boolean flag=userDetailsDao.insert(userDetails);
		System.out.println("saved");
		assertEquals("UserDetailsTestCase",true,flag);
	}
}
