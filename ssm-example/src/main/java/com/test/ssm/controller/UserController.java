package com.test.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.ssm.dao.UserDao;
import com.test.ssm.model.Book;
import com.test.ssm.model.User;
import com.test.ssm.model.UserBook;
import com.test.ssm.model.UserList;

import javax.annotation.Resource;
import javax.ws.rs.PathParam;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name = "userDao")
	private UserDao userDao;
	@Resource(name = "sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	protected final Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/xml;charset=UTF-8")
	public @ResponseBody User queryUserDataById(@PathVariable("id") String id) {
		logger.info("查询   User 信息");
		User user = userDao.getUser(Integer.valueOf(id));
		return user;
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/xml;charset=UTF-8")
	public @ResponseBody UserList queryAllUserData() {
		logger.info("查询   所有User 信息");
		List<User> user = userDao.getAllUser();
		UserList users = new UserList();
		users.setUserlist(user);
		return users;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/xml;charset=UTF-8")
	public @ResponseBody User updateUserData(@PathVariable("id") String id,
			@RequestBody User user) {
		logger.info(" Update User 信息");
		int i = userDao.updateUser(user);
		logger.info(" Get New User 信息");
		User usernew = userDao.getUser(user.getId());
		return usernew;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/xml;charset=UTF-8")
	public @ResponseBody String deleteUserData(@PathVariable("id") String id) {
		logger.info(" Dlete  User 信息");
		int i = userDao.deleteUser(Integer.parseInt(id));
		String response = "";
		if (i > 0) {
			response = "SUCCESS";
		} else {
			response = "FAILED";
		}
		return response;
	}

	@RequestMapping(value = "/insertUserBook", method = RequestMethod.POST, produces = "application/xml;charset=UTF-8")
	public @ResponseBody UserBook insertUserBook(@RequestBody UserBook userbook) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserDao userDaoN = sqlSession.getMapper(UserDao.class);
			User user = userbook.getUser();
			logger.info(" Insert User 信息");
			int i = userDaoN.saveUser(user);
			Book book = userbook.getBook();
			logger.info(" Insert Book 信息");
			int j = userDaoN.saveBook(book);
			userbook.setUser(user);
			userbook.setBook(book);
			logger.debug(userbook.toString());
			sqlSession.commit();
		} catch (Exception e) {
			logger.error(e.toString());
			sqlSession.rollback();
		} finally {
			sqlSession.close();
		}
		return userbook;
	}

	@RequestMapping(value = "/getUserBook", method = RequestMethod.GET, produces = "application/xml;charset=UTF-8")
	public @ResponseBody UserBook getUserBook(@PathParam("userid") int userid,
			@PathParam("bookid") int bookid) {
		logger.debug(" Get User 信息");
		User user = userDao.getUser(userid);
		logger.debug(" Get User 信息 :" + user.toString());
		logger.debug(" Get Book 信息");
		Book book = userDao.getBook(bookid);
		logger.debug(" Get Book 信息 : " + book.toString());
		UserBook userbook = new UserBook(user, book);
		// logger.debug(userbook.toString());
		return userbook;
	}
	@RequestMapping(value = "/getUserBook2", method = RequestMethod.GET, produces = "application/xml;charset=UTF-8")
	public @ResponseBody UserBook getUserBook2(@PathParam("userid") int userid,
			@PathParam("bookid") int bookid) {
		UserBook userbook = new UserBook();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try{
			UserDao userDaoN = sqlSession.getMapper(UserDao.class);
			logger.debug(" Get User 信息");
			User user = userDaoN.getUser(userid);
			logger.debug(" Get User 信息 :" + user.toString());
			logger.debug(" Get Book 信息");
			Book book = userDaoN.getBook(bookid);
			logger.debug(" Get Book 信息 : " + book.toString());
			userbook.setBook(book);
			userbook.setUser(user);
			logger.debug(userbook.toString());
			sqlSession.commit();
		}catch(Exception e){
			logger.error(e.toString());
			sqlSession.rollback();
		}finally{
			sqlSession.close();
		}
		return userbook;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/getUserList",method = RequestMethod.GET, produces = "application/xml;charset=UTF-8")
	public @ResponseBody List<User> queryUserList() {
		logger.info("查询   所有User 信息");
		List<User> userlist = userDao.getAllUser();
		//UserList users = new UserList();
		//users.setUserlist(user);
		return userlist;
	}
	
	@RequestMapping(value = "/insertUserList", method = RequestMethod.POST, produces = "application/xml;charset=UTF-8")
	public @ResponseBody UserList insertUserList(){
		//List<User> userlist = userDao.getAllUser();
		List<User> userlist =new ArrayList<User>();
		userlist.add(new User(1,"Blue","Yuan.Ziyang"));
		userlist.add(new User(2,"袁子洋","yzyBlue1991"));
		userlist.add(new User(3,"心字成灰","小灰灰"));
		int i=userDao.insertUserList(userlist);
		UserList users = new UserList();
		users.setUserlist(userlist);
		return users;
	}
	
}
