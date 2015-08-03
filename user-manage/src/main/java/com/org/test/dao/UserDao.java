package com.org.test.dao;

import java.util.List;
import com.org.test.model.User;


public interface UserDao extends AbstractGenericDao<User, Integer>{

	public int insertUser(User user); 
	
	public String deleteUser(int id);
	
	public List<User> getAllUsers();
}
