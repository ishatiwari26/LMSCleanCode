package org.yash.model;

public class Book /* implements Comparable<Book> */ {
	private int id;
	private String bookName;
	private String bookTitle;
	private String bookAuthor;
	private int price;

	public Book(int id, String bookName, String bookTitle, String bookAuthor, int price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public boolean equals(Book book) {
		if (book == this)
			return true;

		if (book == null || book.getClass() != this.getClass())
			return false;
		Book bookObj = book;
		if (bookObj.id == id && bookObj.bookName.equals(bookName) && bookObj.bookTitle.equals(bookTitle)
				&& bookObj.bookAuthor.equals(bookAuthor) && bookObj.price == price) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + id;
		result = 31 * result + bookName.hashCode();
		result = 31 * result + bookTitle.hashCode();
		result = 31 * result + bookAuthor.hashCode();
		result = 31 * result + price;

		return result;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", price=" + price + "]";
	}

	/*
	 * @Override public int compareTo(Book book) { if (book.id == id) return 0;
	 * else if (id > book.id) return 1; else return -1; }
	 */
}
