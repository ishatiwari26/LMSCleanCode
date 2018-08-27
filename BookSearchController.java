package org.yash.controller;

import java.util.List;
import java.util.Scanner;

import org.yash.model.Book;
import org.yash.service.BookService;

public class BookSearchController {
	Scanner scanInput;

	public static void callingSearchBook() {
		try {
			new BookSearchController().searchCategory();

		} catch (Exception e) {

			System.out.println("Somethink went wrong.");
		}
	}

	public void searchCategory() {
		System.out.println("################### Welcome to Library Management system ###################");

		BookService bookService;
		try {
			scanInput = new Scanner(System.in);

			while (true) {
				System.out.println(
						"Search Book By Category. Please enter 1 to 3 number. 1 - Thriller , 2 - Action, 3 - Romantic");
				int optionCategory = scanInput.nextInt();

				bookService = BookFactory.getBookCatagory(optionCategory);
				filterSearch(bookService);

			}
		} catch (Exception e) {
			System.out.println("Invalid Input.");
		}

	}

	private void filterSearch(BookService bookService) {

		System.out.println("Please enter 1 to 4 number. 1 - Name , 2 - Title , 3 - Auther, 4 - Id, 5 - Exit");
		List<Book> books;
		Book beanBook;
		int option = scanInput.nextInt();
		switch (option) {
		case 1:
			System.out.println("Enter Book Name :- ");
			scanInput.nextLine();
			String inputName = scanInput.nextLine();
			books = bookService.searchBookByName(inputName);
			System.out.println("Books available are : ");
			books.stream().map(result -> result + " ").forEach(System.out::print);
			System.exit(0);
		case 2:
			System.out.println("Enter Book Title :- ");
			scanInput.nextLine();
			String inputTitle = scanInput.nextLine();
			books = bookService.searchBookByTitle(inputTitle);
			System.out.println("Books available are : ");
			books.stream().map(result -> result + " ").forEach(System.out::print);
			System.exit(0);
		case 3:
			System.out.println("Enter Book Auther :- ");
			scanInput.nextLine();
			String inputAuthor = scanInput.nextLine();
			books = bookService.searchBookByAuther(inputAuthor);
			System.out.println("Books available are : ");
			books.stream().map(result -> result + " ").forEach(System.out::print);
			System.exit(0);

		case 4:
			System.out.println("Enter Book Id (Only Numbers) :- ");
			int intValue = 0;
			if (scanInput.hasNextInt()) {
				scanInput.nextInt();
				intValue = scanInput.nextInt();
				beanBook = bookService.searchBookById(intValue);
				System.out.println("Books available are : ");
				beanBook.toString();
			} else {
				System.out.println("Please enter correct value. Only number.");
			}
			System.exit(0);

		case 5:
			System.exit(0);

		default:
			System.out.println("Enter valid option");
		}
	}

}
