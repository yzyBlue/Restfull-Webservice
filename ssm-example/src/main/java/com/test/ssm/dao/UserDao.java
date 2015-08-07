package com.test.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.test.ssm.model.Book;
import com.test.ssm.model.User;
@Repository("userDao")
public interface UserDao {
	public User getUser(int id);
	public int saveUser(User user);
	public int deleteUser(int id);
	public List<User> getAllUser();
	public User getUserByName(String username);
	public int updateUser(User user);
	public int saveBook(Book book);
	public Book getBook(int bookid);
	public User selectUserByNameAndId(@Param("id") String id, @Param("username") String username);
}
