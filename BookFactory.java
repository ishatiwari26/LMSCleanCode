package org.yash.controller;

import java.util.ArrayList;
import java.util.List;

import org.yash.model.Book;
import org.yash.service.BookService;
import org.yash.serviceImpl.ActionBookServiceImpl;
import org.yash.serviceImpl.RomanticBookServiceImpl;
import org.yash.serviceImpl.ThrillerBookServiceImpl;

public class BookFactory {
	static List<Book> booksBeans = new ArrayList<Book>();

	public static List<Book> addBooksInLibrary() {
		Book beanBook1 = new Book(1, "The Odyssey", "Thriller", "Homer", 2500);
		Book beanBook2 = new Book(2, "Gulliver's Travels", "Thriller", "Jonathan Swift", 2000);
		Book beanBook3 = new Book(3, "Moby-Dick", "Action", "Herman Melville", 1080);
		Book beanBook4 = new Book(4, "Treasure Island", "Action", "Robert Louis Stevenson", 1500);
		Book beanBook5 = new Book(5, "The Adventures of Huckleberry Finn", "Romantic", "Mark Twain", 850);
		Book beanBook6 = new Book(6, "The Call of the Wild", "Romantic", "Jack London", 980);
		booksBeans.add(beanBook1);
		booksBeans.add(beanBook2);
		booksBeans.add(beanBook3);
		booksBeans.add(beanBook4);
		booksBeans.add(beanBook5);
		booksBeans.add(beanBook6);
		return booksBeans;
	}

	public static BookService getBookCatagory(int catagory) throws Exception {
		if (catagory == 1) {
			return new ThrillerBookServiceImpl();
		} else if (catagory == 2) {
			return new ActionBookServiceImpl();
		} else {
			return new RomanticBookServiceImpl();
		}
	}

}
