package com.author.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.author.model.Book;
import com.author.service.IAuthorService;

@RestController

public class Authorcontroller {
	
	@Autowired
	IAuthorService authorService;
	
 @RequestMapping("/book")
 public String hello() {
	 return "Effective Java";
 }

 @PostMapping("/books")
 Integer createBook(@RequestBody Book book ) {
	 Integer id = authorService.saveBook(book);
	 System.out.println(id);
	 return id;
 }
 
 @GetMapping("/allbooks")
 public List<Book> getBook(){
	 return authorService.getAllBooks();
 }
 
 @DeleteMapping("/deletebooks")
 public String deleteAllBook(){
	authorService.deleteAll();
	return "Deleted all Books";
 }
	 
	 
 @GetMapping("/getbook/{id}")
 public Optional<Book> getEmployee(@PathVariable Integer id){
	 Optional<Book> employee = authorService.getBook(id);
	 return employee; 
 }
 
 @DeleteMapping ("/deletebook/{id}")
 public ResponseEntity<Book> deleteBook(@PathVariable Integer id){
	 System.out.println(id);
	 ResponseEntity<Book> responseEntity = new ResponseEntity<>(HttpStatus.OK);
	 
			 try {
				 authorService.getBook(id);
			 }
	 		catch(Exception e) {
	 			e.printStackTrace();
	 			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 		}
	 return responseEntity;
 }
 
 @PutMapping("/updatebook/{id}")
 public ResponseEntity<Book> upadtebook(@PathVariable("id") Integer id, @RequestBody Book book){
	 return new ResponseEntity<Book>(authorService.updateBook(book,id),HttpStatus.OK);
	 
 }
 
 
 
}

