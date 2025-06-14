package com.example.books.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "books")

public class Book {
	
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getPublishedYear() {
		return publishedYear;
	}


	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column	
	private int bookId;
	
	@Column
	private String Title;
	
	@Column
	private String author;
	
	@Column
	private String isbn ;
	
	
	@Column
	private int publishedYear;
	
	
	
	
	
	

}
