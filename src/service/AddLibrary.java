package service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import model.Books;
import model.Libraries;

public class AddLibrary {
Scanner scanner = new Scanner(System.in);
	
	//Adding whole library with books
	public Map<Libraries, Set<Books>> addLibBooks(Map<Libraries, Set<Books>> libraryMap){
		
		Map<Libraries, Set<Books>> library = new HashMap<Libraries, Set<Books>>();
		
		System.out.println("Enter the Id of Library: ");
		int library_id = scanner.nextInt();
		
		System.out.println("Enter the name of Library: ");
		String library_name = scanner.next();
		
		Libraries lib = new Libraries(library_id, library_name);
		
		if(libraryMap.isEmpty()) {
			
			Set<Books> books = addbooks();
			library.put(lib, books);
			
			
			
			return library;
		}else {
			
			for(Libraries lib1: libraryMap.keySet()) {
				
				if(lib1.getLibrary_id() == lib.getLibrary_id() || lib1.getLibrary_name().equals(lib.getLibrary_name())) {
					System.out.println("Library Id or Library Name already Exist!");
					
					return libraryMap;
				}else {
					
					Set<Books> books = addbooks();
					library.put(lib, books);
					
					return library;
				}
					
				
			}
			
		}
				
		
		
		
		

		
		
		return libraryMap;
	}
	
	
	//Adding books for library
	public Set<Books> addbooks(){
		
		//Accepting books in a set
		Set<Books> bookset = new HashSet<Books>();
		System.out.println("Enter the number of books you want to add for library: ");
		
		int books_count = scanner.nextInt();

		for (int i = 0; i < books_count; i++) {
			Books book = new Books();
			 System.out.println("Enter Book Id of book"+i);
			 int book_id = scanner.nextInt();

			 System.out.println("Enter Book Price of book"+i);
			 int book_price = scanner.nextInt();
			 
			 System.out.println("Enter Book Name of book"+i);
			 String book_name = scanner.next();
			 
			 book.setBook_id(book_id);
			 book.setBook_name(book_name);
			 book.setBook_price(book_price);
			 
			 bookset.add(book);
		}
		

		
		return bookset;
	}
	
}

