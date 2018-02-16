package com.ModelMadness;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ModelMadness.dao.UserDao;
import com.ModelMadness.model.User;



/**
 * Unit test for simple App.
 */
public class UserTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static UserDao userDao;

	@Autowired
	static User user;

	// The above objects need to initialize
	/**
	 * This method is going execute before calling any one of test case and will
	 * execute only once
	 */
	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();

		// get the userDAO from context
		// get the user from context

		userDao = (UserDao) context.getBean("userDao");
		
		user=context.getBean(User.class);

	}
	@Ignore
	@Test
	public void createUserTestCase() {
		user.setId("10");
		user.setName("SOWMYA REDDY");
		user.setPassword("SWEETY");
		user.setRole("ROLE_SUPPLIER");
		//user.setMobile(9815);
		boolean flag = userDao.insert(user);
		System.out.println("saved");
		assertEquals("UserTestCase", true, flag);
		// sa

	}

	// TODO Auto-generated method stub

}
