package com.ModelMadness.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ModelMadness.model.Category;



@Component
public interface CategoryDao {
	public boolean insertCategory(Category category);
	public boolean save(Category category);
	public int saveOrUpdate(Category category);
	
	public boolean delete(Category category);
	public Category getCategoryById(String cid);
	public Category getCategoryByName(String name);
	public List<Category> list();
	
}
