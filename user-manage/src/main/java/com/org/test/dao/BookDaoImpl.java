package com.org.test.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.org.test.model.Book;
@Repository("bookDao")
public class BookDaoImpl extends AbstractGenericDaoImpl<Book,Integer> implements BookDao {
	protected final Logger logger =Logger.getLogger(this.getClass()) ;
	public Book insertBookInfo(Book book){
		logger.debug("insert book info "+book.toString());
		Book newbook=saveReturnId(book);
		return newbook;
	}

}
