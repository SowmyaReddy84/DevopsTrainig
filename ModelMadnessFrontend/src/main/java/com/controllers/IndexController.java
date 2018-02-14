package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ModelMadness.dao.ProductDao;
import com.ModelMadness.model.Product;





@Controller
public class IndexController {

	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;
	
	
	@RequestMapping("/")
	public ModelAndView getLanding()
	{
		ModelAndView mv=new ModelAndView("LandingPage");
		List<Product> plist=productDao.getAllProduct();
		mv.addObject("pList", plist);
		System.out.println(plist.size());
		mv.addObject("msg", "Hello world");
		return mv;
	}

}
