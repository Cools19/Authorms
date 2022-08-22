package com.author.service;

import java.util.List;
import java.util.Optional;

import com.author.model.Book;

public interface IAuthorService {
	
	Integer saveBook(Book book);
	public List<Book> getAllBooks();
	Optional<Book> getBook(Integer id);
	public void deleteBook(Integer id);
	public Book updateBook(Book book, Integer id) ;
	public void deleteAll();

}
