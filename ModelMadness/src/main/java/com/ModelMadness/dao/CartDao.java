package com.ModelMadness.dao;

import java.util.List;

import com.ModelMadness.model.Cart;

public interface CartDao {
	public boolean insert(Cart cart);
public int saveOrUpdate(Cart cart);
public boolean deleteById(int catid);
public List<Cart> getAllCart();
public Cart getCartById(int Userid);

}
