package com.ModelMadness.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Cart {
	
	@Id
	private int catid;
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	

	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}



	private String Userid;
	private int productId;
	private double prodPrice;

}
