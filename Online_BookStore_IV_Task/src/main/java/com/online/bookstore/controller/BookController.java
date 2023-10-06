package com.online.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.bookstore.model.Books;
import com.online.bookstore.serviceI.BookServiceI;

@CrossOrigin("*")
@RestController
public class BookController {

	@Autowired
	public BookServiceI bookServiceI;

	@GetMapping("allBooks")
	public ResponseEntity<List<Books>> getAllBooks() {
		return new ResponseEntity<List<Books>>(bookServiceI.getAllBooknfo(), HttpStatus.OK);
	}

	@GetMapping("findBookBYISBN/{isbn}")
	public ResponseEntity<Books> getBookByISBN(@PathVariable int isbn) {
		return new ResponseEntity<Books>(bookServiceI.getBookByISBN(isbn), HttpStatus.OK);

	}

	@GetMapping("findById/{bookId}")
	public ResponseEntity<Books> getBook(@PathVariable int bookId) {
		return new ResponseEntity<Books>(bookServiceI.getBookByBookId(bookId), HttpStatus.OK);
	}

	@PutMapping("byBook/{bookId}")
	public ResponseEntity<Books> byBook(@RequestBody Books b, @PathVariable int bookId) {
		return new ResponseEntity<Books>(bookServiceI.byBook(b, bookId), HttpStatus.OK);
	}
}
