package com.org.test.dao;

import com.org.test.model.User;



public interface UserDao extends AbstractGenericDao<User, Integer>{

	public int insertUser(User user); 
}
