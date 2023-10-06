package com.online.bookstore.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.bookstore.model.Books;

@Repository
public interface BookRepositry extends JpaRepository<Books, Integer> {

	Books findByISBN(int isbn);

}
