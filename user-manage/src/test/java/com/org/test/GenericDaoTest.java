package com.org.test;
import java.util.Date;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.org.test.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
@Transactional

public class GenericDaoTest {
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	@Test
	public void saveAndFind(){
		
		User user=new User();
		user.setPassword("admin");
		user.setUsername("admin");
		System.out.println(" ------------------------------------------------------------------------");
		System.out.println(user);
		System.out.println(" ------------------------------------------------------------------------");
		User r=(User)this.getSession().merge(user);
		System.out.println(" ------------------------------------------------------------------------");
		System.out.println(r);
		System.out.println(" ------------------------------------------------------------------------");
		System.out.println(" save Success !");
		System.out.println(" ------------------------------------------------------------------------");

		//System.out.println();
		//System.out.println(" ------------------------------------------------------------------------");
		//System.out.println(" find Success !");
	}
	
}
