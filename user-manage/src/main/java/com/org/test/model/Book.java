package com.org.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "BOOKTABLE")
@XmlRootElement(name = "BookInfo")
public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5319584174353343475L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOKID", unique = true, nullable = false)
	private int bookId;
	@Column(name="BOOKCODE")
	private String bookCode;
	@Column(name="BOOKNAME")
	private String bookName;
	public Book() {
		super();
	}
	public Book(int bookId, String bookCode, String bookName) {
		super();
		this.bookId = bookId;
		this.bookCode = bookCode;
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bookCode == null) ? 0 : bookCode.hashCode());
		result = prime * result + bookId;
		result = prime * result
				+ ((bookName == null) ? 0 : bookName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookCode == null) {
			if (other.bookCode != null)
				return false;
		} else if (!bookCode.equals(other.bookCode))
			return false;
		if (bookId != other.bookId)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookCode=" + bookCode
				+ ", bookName=" + bookName + "]";
	}
}
