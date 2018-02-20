package com.ModelMadness.dao;

import java.util.List;

import com.ModelMadness.model.UserDetail;





public interface UserDetailDao {
	public  boolean insert(UserDetail userDetails);
	int saveOrUpdate(UserDetail userdetail);
	  public  List<UserDetail>getAllUserDetail();
	   int deleteById(int userdetailId);
	   ;
}
