package com.org.test.dao;

import com.org.test.model.Book;

public interface BookDao extends AbstractGenericDao<Book, Integer>{
	
	public Book insertBookInfo(Book book);

}
