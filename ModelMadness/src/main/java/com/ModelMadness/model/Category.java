package com.ModelMadness.model;
import java.util.HashSet;
import java.util.Set;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Category")
public class Category {
	@Id
	
	
	private String cid;
	
	private String cname;
	
	private String description;
//	@OneToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="category")
//	private Set<Product> products=new HashSet<Product>(0);
//
//	public Set<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(Set<Product> products) {
//		this.products = products;
//	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
