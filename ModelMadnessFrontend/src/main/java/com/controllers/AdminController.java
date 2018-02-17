package com.controllers;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ModelMadness.dao.CategoryDao;
import com.ModelMadness.dao.ProductDao;
import com.ModelMadness.dao.SupplierDao;
import com.ModelMadness.model.Category;
import com.ModelMadness.model.Product;
import com.ModelMadness.model.Supplier;




@Controller
public class AdminController {
	
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	Category category;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	Supplier supplier;
	
	@Autowired
	SupplierDao supplierDao;
	
	
	@RequestMapping("/admin")
	public ModelAndView addProducts(@ModelAttribute("prod")Product product,@ModelAttribute("category")Category category,@ModelAttribute("supplier")Supplier supplier)
	{
		
		ModelAndView mv=new ModelAndView("Admin");

		mv.addObject("prod", product);
		return mv;
	}
	
	@RequestMapping("admin/saveProduct")
	
	public String savingProduct(@ModelAttribute("prod") Product product,BindingResult result,HttpServletRequest request, final RedirectAttributes redirectAttributes){
		System.out.println("After submit");
		redirectAttributes.addFlashAttribute("message","true");
		redirectAttributes.addFlashAttribute("prod",product);
		productDao.saveOrUpdate(product);
		MultipartFile itemimage=product.getPimg();
		String rootdir=request.getSession().getServletContext().getRealPath("/");
		System.out.println("multipart partially Done"+rootdir);
		Path path = Paths.get(rootdir+"/resources/includes/img/"+product.getPid()+".jpg");
		 if(itemimage!=null && !itemimage.isEmpty()){
				try{
					System.out.println("OOOOOOOOOOOOOOOO "+path.toString());
					itemimage.transferTo(new File(path.toString()));
				}
				catch(Exception e)
				{
					e.printStackTrace();
					throw new RuntimeException("product image saving failed", e);
				}
			}

		/*ModelAndView mv=new ModelAndView();
		int count=0;
		System.out.println(product.getPname()+" "+product.getPid());
		count=productDao.saveOrUpdate(product);
		
		if(count>0){mv.addObject("success", "Product Data Inserted Succefully");}
		*/
		return "redirect:/admin/listing";
	}

	@RequestMapping("admin/saveCategory")
	  public String savingCategory(@ModelAttribute("category") Category category, final RedirectAttributes redirectAttributes)
	  {
			ModelAndView mv=new ModelAndView();
			int count=0;
			System.out.println(category.getCid()+" "+category.getCname());
			count=categoryDao.saveOrUpdate(category);
			
		if(count>0){mv.addObject("success", "Category Data Inserted Succefully");}
			
			return "redirect:/product";
	}
	@RequestMapping("admin/saveSupplier")
	  public String savingSupplier(@ModelAttribute("supplier") Supplier supplier, final RedirectAttributes redirectAttributes)
	  {
			ModelAndView mv=new ModelAndView();
			int count=0;
			System.out.println(supplier.getSid()+supplier.getSname());
			count=supplierDao.saveOrUpdate(supplier);
			
		if(count>0){mv.addObject("success", "Supplier Data Inserted Succefully");}
			
			return "redirect:/product";
	}
	
	@RequestMapping("admin/listing")
	   public ModelAndView getAllProduct()
	   {
		   ModelAndView mv=new ModelAndView("TableProduct");
		   List<Product> plist=productDao.getAllProduct();
		   mv.addObject("pList", plist);
		   return mv;
	   }
	
	

}
