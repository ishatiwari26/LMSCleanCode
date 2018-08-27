package org.yash.serviceImpl;

import java.util.List;

import org.yash.dao.BookDao;
import org.yash.daoImpl.BookDaoImpl;
import org.yash.model.Book;
import org.yash.service.BookService;

public class ThrillerBookServiceImpl implements BookService {
	private BookDao bookDao = new BookDaoImpl();

	@Override
	public List<Book> searchBookByTitle(String bookTitle) {
		return bookDao.searchBookByTitle(bookTitle);
	}

	@Override
	public List<Book> searchBookByAuther(String bookAuther) {
		return bookDao.searchBookByAuther(bookAuther);
	}

	@Override
	public List<Book> searchBookByName(String bookName) {
		return bookDao.searchBookByName(bookName);
	}

	@Override
	public Book searchBookById(int bookId) {
		return bookDao.searchBookById(bookId);
	}

}
