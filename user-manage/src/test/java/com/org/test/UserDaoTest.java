package com.org.test;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.org.test.dao.UserDao;
import com.org.test.model.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
@Transactional

public class UserDaoTest {
	@Resource(name = "userDao")
	private UserDao UserDao;
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	@Test
	public void test() {
		User user=new User();
		user.setPassword("admin");
		user.setUsername("admin");
		User r=UserDao.saveReturnId(user);
	}

}
