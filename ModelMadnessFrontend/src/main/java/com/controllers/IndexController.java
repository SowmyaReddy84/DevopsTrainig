package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ModelMadness.dao.ProductDao;
import com.ModelMadness.dao.UserDao;
import com.ModelMadness.model.Product;
import com.ModelMadness.model.User;





@Controller
public class IndexController {

	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	User user;
	
	@Autowired
	UserDao userDao;
	
	
	
	
	
	@RequestMapping("/home")
	public ModelAndView getLanding()
	{
		ModelAndView mv=new ModelAndView("index");
		List<Product> plist=productDao.getAllProduct();
		mv.addObject("pList", plist);
		System.out.println(plist.size());
		mv.addObject("msg", "Hello world");
		return mv;
	}
	@RequestMapping("/homepage")
	public ModelAndView getHomePage()
	{
		ModelAndView mv=new ModelAndView("index");
		List<Product> plist=productDao.getAllProduct();
		mv.addObject("pList", plist);
		System.out.println(plist.size());
		mv.addObject("msg", "Hello world");
		return mv;
	}
	@RequestMapping("SignIn")
	public String getSignIn(){
		return "SignIn";
	}
	@RequestMapping("Registration")
	public String getRegistration(){
		return "Registration";
	}

}
