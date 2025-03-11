package com;


import com.model.Author;
import com.model.Book;

public class Main {
	public static void main(String[] args) {
		Book book=new Book();
		book.setTitle("Complete Java");
		Author author = new Author();
		author.setName("Thomsan");
		book.setAuthor("Mick Tyson");
		System.out.println(book);
		
		Book book1=new Book();
		book.setTitle("Complete Spring");
		Author author1 = new Author();
		author.setName("Overtank");
		book.setAuthor("Root cook");
		System.out.println(book);
	}

}
