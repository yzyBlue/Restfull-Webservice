package com.test.ssm.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.ssm.dao.UserDao;
import com.test.ssm.model.User;
import com.test.ssm.model.UserList;

import javax.annotation.Resource;
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name = "userDao")
	private UserDao UserDao;
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,produces = "application/xml;charset=UTF-8")
	public @ResponseBody User queryUserDataById(@PathVariable("id") String id){
		logger.info("��ѯ   User ��Ϣ");
		User user=UserDao.getUser(Integer.valueOf(id));
		return user;
	}
	
	@RequestMapping(method = RequestMethod.GET,produces = "application/xml;charset=UTF-8")
	public @ResponseBody UserList queryAllUserData(){
		logger.info("��ѯ   User ��Ϣ");
		List<User> user=UserDao.getAllUser();
		UserList users=new UserList();
		users.setUserlist(user);
		return users;
	}
}