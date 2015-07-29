package com.org.test.service;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.transaction.Transactional;
import com.org.test.dao.UserDao;
import com.org.test.model.User;
import org.apache.log4j.Logger;


@WebService(serviceName="UserService")
@Transactional
public class UserServiceImpl implements UserService{
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	@Resource(name = "userDao")
	private UserDao UserDao;
	@WebMethod
	public String register(String username,String password){
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		User r=UserDao.saveReturnId(user);
		if (r==null||r.getId()==0){
			return "insert userinfo failed";
		}else{
			return "insert userinfo success ： "+r.getId();
		}
	}
}
