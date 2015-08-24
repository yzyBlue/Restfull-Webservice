package com.test.ssm.dao.test;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.test.ssm.model.Book;
import com.test.ssm.model.IntegrationResult;
import com.test.ssm.model.User;
import com.test.ssm.util.DataValidationUtil;

public class DataValidateTest {
	protected final Logger logger = Logger.getLogger(this.getClass());

	@Test
	public void dataValidateTest() throws Exception {
		IntegrationResult integrationResult = new IntegrationResult();
		User user = new User();
		user.setusername("admin");
		user.setPassword("admin");
		integrationResult = DataValidationUtil.validate(user);
		logger.debug(integrationResult.toString());
		
		IntegrationResult integrationResult2 = new IntegrationResult();
		Book book = new Book();
		Date date=new Date();
		book.setBookId(1);
		book.setBookCode("Book-01");
		book.setBookName("BookName");
		book.setPressDate(date);
		integrationResult2=DataValidationUtil.validate(book);
		logger.debug(integrationResult2.toString());
	}
}
