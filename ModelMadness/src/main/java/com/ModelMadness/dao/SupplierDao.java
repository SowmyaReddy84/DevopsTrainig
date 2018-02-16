package com.ModelMadness.dao;

import java.util.List;

import com.ModelMadness.model.Supplier;



public interface SupplierDao {
	public boolean insert(Supplier supplier);
	public int saveOrUpdate(Supplier supplier);
	public boolean delete(Supplier supplier);
	public List<Supplier> getAllSupplierList();
	public Supplier getSupplier(String sid);
	
	
	
	

}
