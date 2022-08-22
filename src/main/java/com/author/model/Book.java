package com.author.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 private String title;
     private String category;
     private String image;
     private String price;
     private String publisher;
     private String active;
	private String content;
     
	public Book() {
		super();
	}
	
	public Book (int id,String title, String category, String image, String price, String publisher, String active, String content) {
		super();
		
		this.id= id;
		this.title= title;
				this.category =category;
				this.image= image;
				this.price= price;
				this.publisher= publisher;
				this.active= active;
				this.content= content;
		 
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

	
     
}
