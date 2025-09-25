package com.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Logger;

class Book {
	int id;
	String name;
	double price;

	Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}
}

public class CreateLinkedHashsetUsingConstructor {
	private static final Logger log=Logger.getLogger(CreateLinkedHashsetUsingConstructor.class.getName());
	public static void main(String[] args) {

		Set<Book> book = new LinkedHashSet<Book>();

		Book b1 = new Book(1, "java", 2000.0);
		Book b2 = new Book(2, "php", 1000.0);
		Book b3= new Book(3, "python", 3000.0);
		 
		book.add(b1);
		book.add(b2);
		book.add(b3);
         
		for(Book b:book) {
			   log.info(b.id+ " "+b.name +" "+ b.price+ " ");
		}
		

	}

}
