package com.ModelMadness.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
	@Id
	private int cid;
	private int id_userid;
	private int pid;
	private String prdName;
	private Double prdPrice;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getId_userid() {
		return id_userid;
	}
	public void setId_userid(int id_userid) {
		this.id_userid = id_userid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public Double getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(Double prdPrice) {
		this.prdPrice = prdPrice;
	}

}
