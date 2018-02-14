package com.ModelMadness.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;



@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private String description;
	private Double price;
	private Integer stock;
	
	
	
	@Transient
	MultipartFile pimage;
	private String pimage1;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getPimage1() {
		return pimage1;
	}
	public void setPimage1(String pimage1) {
		this.pimage1 = pimage1;
	}

}
