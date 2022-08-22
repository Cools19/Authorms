package com.author.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.model.Book;

public interface IAuthorRepository extends JpaRepository<Book,Integer>  {

	Book save(Book book);

	Optional<Book> findById(Integer id);




	/*public Book save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Book> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
