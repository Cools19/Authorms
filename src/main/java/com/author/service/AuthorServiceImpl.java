package com.author.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.model.Book;

@Service
public class AuthorServiceImpl  implements IAuthorService {
	
	@Autowired
	IAuthorRepository authorRepository;
	
	@Override 
	public Integer saveBook(Book book) {
		Book savedBook = authorRepository.save(book);
		return savedBook.getId();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return authorRepository.findAll();
	}

	@Override
	public Optional<Book> getBook(Integer id) {
		// TODO Auto-generated method stub
			return authorRepository.findById(id);
	}

	@Override
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub
		authorRepository.deleteById(id);
		
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		// TODO Auto-generated method stub
		Book existingbook = authorRepository.findById(id).orElse(book);
				
		existingbook.setTitle(book.getTitle());
		existingbook.setCategory(book.getCategory());
		existingbook.setImage(book.getImage());
		existingbook.setPrice(book.getPrice());
		existingbook.setPublisher(book.getPublisher());
		existingbook.setActive(book.getActive());
		existingbook.setContent(book.getContent());
		authorRepository.save(existingbook);
		return existingbook;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		authorRepository.deleteAll();
	}

}
