package com.online.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bookId;
	String title;
	String author;
	int ISBN;
	double price;
	int quantity;
	
	

}
