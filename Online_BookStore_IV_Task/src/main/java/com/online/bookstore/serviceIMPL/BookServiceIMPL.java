package com.online.bookstore.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.bookstore.model.Books;
import com.online.bookstore.repositry.BookRepositry;
import com.online.bookstore.serviceI.BookServiceI;

@Service
public class BookServiceIMPL implements BookServiceI {

	@Autowired
	public BookRepositry bookrepositry;

	@Override
	public List<Books> getAllBooknfo() {
		return bookrepositry.findAll();
	}

	@Override
	public Books getBookByISBN(int isbn) {
		return bookrepositry.findByISBN(isbn);

	}

	@Override
	public Books getBookByBookId(int bookId) {
		return bookrepositry.findById(bookId).get();
	}

	@Override
	public Books byBook(Books b, int bookId) {

		Books books = bookrepositry.findById(bookId).get();
		books.setQuantity(books.getQuantity() - 1);
		System.out.println(books.getQuantity());
		return bookrepositry.save(books);

	}

}
