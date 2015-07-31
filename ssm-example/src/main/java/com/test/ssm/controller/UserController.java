package com.test.ssm.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	private UserDao userDao;
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,produces = "application/xml;charset=UTF-8")
	public @ResponseBody User queryUserDataById(@PathVariable("id") String id){
		logger.info("��ѯ   User ��Ϣ");
		User user=userDao.getUser(Integer.valueOf(id));
		return user;
	}
	
	@RequestMapping(method = RequestMethod.GET,produces = "application/xml;charset=UTF-8")
	public @ResponseBody UserList queryAllUserData(){
		logger.info("��ѯ   User ��Ϣ");
		List<User> user=userDao.getAllUser();
		UserList users=new UserList();
		users.setUserlist(user);
		return users;
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}",produces = "application/xml;charset=UTF-8")
	public @ResponseBody User updateUserInfo(@PathVariable String id, @RequestBody User user){
		logger.info(" update User ��Ϣ  : "+user.toString());
		int i=userDao.updateUser(user);
		logger.info("��ѯ   User ��Ϣ");
		User usernew=userDao.getUser(user.getId());
		return usernew;
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}",produces = "application/xml;charset=UTF-8")
	public @ResponseBody String deleteUserInfo(@PathVariable String id){
		logger.info(" delete User ��Ϣ   ");
		int i=userDao.deleteUser(Integer.parseInt(id));
		String response="";
		if(i>0){
			response="SUCCESS";
		}else{
			response="FAILED";
		}
		return response;
	}
}
