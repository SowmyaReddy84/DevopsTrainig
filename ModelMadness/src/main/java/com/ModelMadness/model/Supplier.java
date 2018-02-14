
	package com.ModelMadness.model;

	import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	import org.springframework.stereotype.Component;

	@Component
	@Entity
	@Table(name = "Supplier")
	public class Supplier {
		@Id
		private String sid;

		public String getSid() {
			return sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		@Column(name = "sname")
		private String sname;

		@Column(name = "password")
		private String password;

		@Column(name = "role")
		private String role;

		@Column(name = "mobile")
		private String mobile;
//		@OneToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="supplier")
//		private Set<Product> products=new HashSet<Product>(0);
//		
//		public Set<Product> getProducts() {
//			return products;
//		}
//
//		public void setProducts(Set<Product> products) {
//			this.products = products;
//		}

		public Supplier(){
			
		}

		// getters + setters

		

		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		

	}


