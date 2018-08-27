package org.yash.dao;

import java.util.List;

import org.yash.model.Book;

public interface BookDao {
	public List<Book> searchBookByTitle(String bookTitle);

	public List<Book> searchBookByAuther(String bookAuther);

	public List<Book> searchBookByName(String bookName);

	public Book searchBookById(int bookId);

}
