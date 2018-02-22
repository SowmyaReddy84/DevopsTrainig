package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ModelMadness.dao.ProductDao;
import com.ModelMadness.dao.UserDao;
import com.ModelMadness.model.Category;
import com.ModelMadness.model.Product;
import com.ModelMadness.model.Supplier;
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
	
	@GetMapping("/dummy")
	public String dummy()
	{
		return "dummy";
	}
	
	
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
	@RequestMapping("admin/homepage")
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
	@RequestMapping("signup")
	public String getRegistration(){
		return "Registration";
	}/*
	@RequestMapping("register")
	public String getRegistrationPage(){
		return "Registration";
	}*/
	@RequestMapping("/register")
	public ModelAndView getRegistrationPage(@ModelAttribute("userd")User user)
	{
		
		ModelAndView mv=new ModelAndView("Registration");

		mv.addObject("userd",user);
		return mv;
	}
	@RequestMapping("insertuserd")
	public String storeuser(@ModelAttribute("userd") User user, final RedirectAttributes redirectAttributes){
		//		  redirectAttributes.addAttribute("message", "true");
		//		  redirectAttributes.addAttribute("user",userDetails);
		ModelAndView mv =new ModelAndView();
		
		System.out.println("DOne "+user.getUsername());
		int count=0;
		System.out.println("Done user is registered successfully");
		user.setRole("ROLE_USER");
		count=userDao.saveOrUpdate(user);
		if(count>0){
			mv.addObject("sucess","User have registered succesfully");
			
		}
		System.out.println("Done rrrrrrrrrrrrrrr ");
		return "redirect:/home";

		
	}
}
