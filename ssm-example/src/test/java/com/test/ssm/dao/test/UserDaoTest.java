package com.test.ssm.dao.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.ssm.dao.UserDao;
import com.test.ssm.model.User;

public class UserDaoTest {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	private ClassPathXmlApplicationContext context;
	//@Resource(name = "userDao")
	private UserDao userDao;
	@Before
	public void init(){
		context=new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
		userDao=(UserDao) context.getBean("userDao");
	}
	@Test
	public void testUserDao(){
		
		logger.debug("*********  getAllUsers  ***********");
		List<User> userlist=userDao.getAllUser();
		logger.debug(userlist.size());
		for (User user:userlist){
			logger.debug("--------------------------------");
			logger.debug(user.toString());
		}
		logger.debug("*********  getAllUsers  ***********");
		
		
//		logger.debug("*********  getUser  ***********");
//		User user=userDao.getUser(3);
//		logger.debug(user.toString());
//		logger.debug(user.getId());
//		logger.debug("*********  getUser  ***********");
//		logger.debug("--------------------------------");
		
//		logger.debug("*********  saveUser  ***********");	
//		User user2=new User();
//		user2.setUsername("Ô¬×ÓÑó");
//		user2.setPassword("yzyBlue1991");
//		long i=userDao.saveUser(user2);
//		logger.debug(user2.getId());
//		logger.debug("*********  saveUser  ***********");
		
//		logger.debug("*********  deleteUser  ***********");
//		int j=userDao.deleteUser(7);
//		logger.debug("*********  deleteUser  ***********");
		
//		logger.debug("*********  getIdByUserName  ***********");
//		User user=userDao.getUserByName("admin");
//		logger.debug(user.getId());
//		logger.debug("*********  getIdByUserName  ***********");
		
		
	}
}
