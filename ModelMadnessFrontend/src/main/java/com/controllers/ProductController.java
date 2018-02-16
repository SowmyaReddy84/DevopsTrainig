package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ModelMadness.dao.ProductDao;
import com.ModelMadness.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping("prodETAIL")
	   public ModelAndView getProDetails(@RequestParam(value="Id", required=true) int pid,final RedirectAttributes redirectAttributes)
	{
		   product=productDao.getProductId(pid);
		   ModelAndView mv=new ModelAndView("ProductDetails");
		   mv.addObject("product",product);
		   return mv;
	}

}
