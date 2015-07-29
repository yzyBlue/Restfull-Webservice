package com.org.test.dao;

import org.springframework.stereotype.Repository;

import com.org.test.model.User;
@Repository("userDao")
public class UserDaoImpl extends AbstractGenericDaoImpl<User,Integer> implements UserDao{

	public int insertUser(User user){
		log.debug("insert a user: " + user);
		User r=saveReturnId(user);
		return r.getId();
	}
	
}
