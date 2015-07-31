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
		logger.info("查询   User 信息");
		User user=UserDao.getUser(Integer.valueOf(id));
		return user;
	}
	
	@RequestMapping(method = RequestMethod.GET,produces = "application/xml;charset=UTF-8")
	public @ResponseBody UserList queryAllUserData(){
		logger.info("查询   User 信息");
		List<User> user=UserDao.getAllUser();
		UserList users=new UserList();
		users.setUserlist(user);
		return users;
	}
<<<<<<< HEAD
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT,produces = "application/xml;charset=UTF-8")
	public @ResponseBody User updateUserData(@PathVariable("id") String id , @RequestBody User user){
		logger.info(" Update  User 信息");
		int i=userDao.updateUser(user);
		logger.info(" Get New User 信息");
		User usernew=userDao.getUser(user.getId());
		return usernew;
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE,produces = "application/xml;charset=UTF-8")
	public @ResponseBody String deleteUserData(@PathVariable("id") String id){
		logger.info(" Dlete  User 信息");
		int i=userDao.deleteUser(Integer.parseInt(id));
		String response="";
		if(i>0){
			response="SUCCESS";
		}else{
			response="FAILED";
		}
		return response;
	}
=======
>>>>>>> origin/master
}
