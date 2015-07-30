package com.test.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.test.ssm.dao.UserDao;
import com.test.ssm.model.User;
import javax.annotation.Resource;
@Controller
public class UserController {
	@Resource(name = "userDao")
	private UserDao UserDao;
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@RequestMapping(value = "/queryUser/{id}", method = RequestMethod.GET,produces = "application/xml;charset=UTF-8")
	public @ResponseBody User queryUserDataById(@PathVariable("id") String id){
		logger.info("≤È—Ø   User –≈œ¢");
		User user=UserDao.getUser(Integer.valueOf(id));
		return user;
	}
}
