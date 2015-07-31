package com.test.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.ssm.model.User;
@Repository("userDao")
public interface UserDao {
	public User getUser(int id);
	public int saveUser(User user);
	public int deleteUser(int id);
	public List<User> getAllUser();
	public User getUserByName(String username);
}
