package com.controllers;

import java.security.Principal;
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
import com.ModelMadness.dao.UserDao;
import com.ModelMadness.dao.UserDetailDao;
import com.ModelMadness.model.Cart;
import com.ModelMadness.model.Product;
import com.ModelMadness.model.User;
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
	UserDao userDao;
	
	@Autowired
	CartDao cartDao;
	
	@Autowired
	UserDetailDao	userDetailsDao;
	
	@Autowired
	UserDetail userDetails;
	
	
	
	@RequestMapping("prodETAIL")
	   public ModelAndView getProDetails(@RequestParam(value="Id", required=true) int pid)
	{
		   product=productDao.getProductId(pid);
		   ModelAndView mv=new ModelAndView("ProductDetails");
		   mv.addObject("product",product);
		   return mv;
	}
	@RequestMapping("addCart")	
	public String addToCart(@RequestParam(value="Id", required=true) int pid,Principal principal)
	{

	/*	User user=userDao.get(principal.getName());
		String userid=user.getUserid();
		product=productDao.getProductId(pid);
		Cart cart;
		if(cartDao.getCartByUsername(userid)==null)
		{
			cart=this.cart;
			
			cart.setProdPrice(product.getPrice());
			cart.setCatid(pid);
			cart.setUserid(userid);
		}else
		{
			cart=cartDao.getCartByUsername(userid);
			cart.set
		}*/
		
		
		
		List<Cart> clist =cartDao.getAllCart();
		int cnt=clist.size();
		cnt=cnt+1;
		cart.setCatid(cnt);
		cart.setProductId(pid);
		cart.setProdPrice(product.getPrice());
		
		
		cartDao.saveOrUpdate(cart);
		return "redirect:prodETAIL?Id="+pid;
	}
	@RequestMapping("tousde")
	   public ModelAndView getbacktouserdet(@ModelAttribute("userdetail") UserDetail userdetail)
	   {
		   ModelAndView mv=new ModelAndView("FormAddUserDetail");
		   mv.addObject("userdetail", userdetail);
		   return mv;
	   }
	 @RequestMapping("totablecart")
	   public ModelAndView getToTableCart()
	   {
		   ModelAndView mv=new ModelAndView("TableCart");
		   List<Cart> clist=cartDao.getAllCart();
		   mv.addObject("cList", clist);
		   return mv;
	   }
	 @RequestMapping("tocarttable")
	   public ModelAndView getCartTable()
	   {
		   ModelAndView mv=new ModelAndView("TableCart");
		   List<Cart> clist=cartDao.getAllCart();
		   mv.addObject("cList", clist);
		   return mv;
	   }
	 @RequestMapping("gotopayment")
	   public ModelAndView gettopayment()
	   {
		   ModelAndView mv=new ModelAndView("payment_details");
		   return mv;
	   }
	 @RequestMapping("success_page")
	   public ModelAndView getthankyou()
	   {
		   ModelAndView mv=new ModelAndView("success_page");
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
