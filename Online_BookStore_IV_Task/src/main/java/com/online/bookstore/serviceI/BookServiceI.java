package com.online.bookstore.serviceI;

import java.util.List;

import com.online.bookstore.model.Books;

public interface BookServiceI {
	public List<Books> getAllBooknfo();

	public Books getBookByISBN(int isbn);

	public Books getBookByBookId(int bookId);

	public Books byBook(Books b,int bookId );
}
