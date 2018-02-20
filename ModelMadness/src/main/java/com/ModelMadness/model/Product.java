package com.ModelMadness.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@SuppressWarnings("serial")
@Component
@Entity
public class Product implements Serializable {
	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private String description;
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private Integer stock;
	
	
	
	@Transient
	private MultipartFile pimg;
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

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public MultipartFile getPimg() {
		return pimg;
	}
	public void setPimg(MultipartFile pimg) {
		this.pimg = pimg;
	}
	
	

}
