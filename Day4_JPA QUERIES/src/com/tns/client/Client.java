package com.tns.client;

import com.tns.service.BookService;
import com.tns.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		System.out.println("Listing total no.of  the books: ");
		System.out.println("Total books: "+service.getBookCount() );
		System.out.println("Listing book with id:104: ");
		System.out.println("Book with ID:104: "+service.getBookById(104) );
		System.out.println("Listing book between 300 to 600: ");
		System.out.println("Listing book between 300 to 600: "+service.getBooksInPriceRange(300, 600) );
	}

}
