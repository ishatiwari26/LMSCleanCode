package org.yash.daoImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.yash.controller.BookFactory;
import org.yash.dao.BookDao;
import org.yash.model.Book;

public class BookDaoImpl implements BookDao {

	List<Book> booksBeans = BookFactory.addBooksInLibrary();

	@Override
	public List<Book> searchBookByTitle(String bookTitle) {
		return booksBeans.stream().filter(b -> b.getBookTitle().equals(bookTitle)).collect(Collectors.toList());
	}

	@Override
	public List<Book> searchBookByAuther(String bookAuther) {
		return booksBeans.stream().filter(b -> b.getBookAuthor().equals(bookAuther)).collect(Collectors.toList());
	}

	@Override
	public Book searchBookById(int bookId) {
		Book book = booksBeans.stream().filter((p) -> p.getId() == bookId).findAny().orElse(null);
		return book;
	}

	@Override
	public List<Book> searchBookByName(String bookName) {
		return booksBeans.stream().filter(b -> b.getBookName().equals(bookName)).collect(Collectors.toList());
	}

}
