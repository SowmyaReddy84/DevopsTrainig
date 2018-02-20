package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ModelMadness.dao.CartDao;
import com.ModelMadness.dao.ProductDao;
import com.ModelMadness.dao.UserDetailDao;
import com.ModelMadness.model.Cart;
import com.ModelMadness.model.Product;
import com.ModelMadness.model.UserDetail;



@Controller
public class ProductController {
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	Cart cart;
	
	@Autowired
	CartDao cartDao;
	
	@Autowired
	UserDetailDao	userDetailsDao;
	
	@Autowired
	UserDetail userDetails;
	
	@RequestMapping("prodETAIL")
	   public ModelAndView getProDetails(@RequestParam(value="Id", required=true) int pid,final RedirectAttributes redirectAttributes)
	{
		   product=productDao.getProductId(pid);
		   ModelAndView mv=new ModelAndView("ProductDetails");
		   mv.addObject("product",product);
		   return mv;
	}
	@RequestMapping("addCart")	
	public String addToCart(@RequestParam(value="Id", required=true) int pid, final RedirectAttributes redirectAttributes)
	{
//		product=productDao.getProductId(pid);
//		List<Cart> clist=cartDao.getAllCart();
//		int cnt=clist.size();
//		cnt=cnt+1;
//		cart.setCartId(cnt);
//		cart.setId_userId(product.getProductId());
//		cart.setCartId(product.getProductId());
//		cart.setProductname(product.getProductName());
//		cart.setProductprice(555);
		product=productDao.getProductId(pid);
		List<Cart> clist =cartDao.getAllCart();
		int cnt=clist.size();
		cnt=cnt+1;
		cart.setCatid(cnt);
		cart.setProductId(pid);
		cart.setProdPrice(product.getPrice());
		
		
		cartDao.saveOrUpdate(cart);
		return "redirect:prodETAIL?Id="+pid;
	}
	 @RequestMapping("totablecart")
	   public ModelAndView getToTableCart()
	   {
		   ModelAndView mv=new ModelAndView("TableCart");
		   List<Cart> clist=cartDao.getAllCart();
		   mv.addObject("cList", clist);
		   return mv;
	   }
	 @RequestMapping("toformadduserdetail")
	   public ModelAndView getUserDetail(@ModelAttribute("userdetail") UserDetail userdetail)
	  	{
	  		ModelAndView mv=new ModelAndView("FormAddUserDetail");
	         mv.addObject("userdetail", userdetail);
	  		return mv;
	  	}
	 @RequestMapping("saveUserDetail")
	   public ModelAndView sendUserDetail(@ModelAttribute("userdetail") UserDetail userDetails, final RedirectAttributes redirectAttributes)
	   {
	 		ModelAndView mv=new ModelAndView("FormAddUserDetail");
	 		int count=0;
	 		System.out.println(userDetails.getUserId()+" "+userDetails.getFirstname());
	 		count=userDetailsDao.saveOrUpdate(userDetails);
	 		
	 	if(count>0){mv.addObject("success", "Users Data Inserted Succefully");}
	 		
	 		return mv;
	 }
	 
}
