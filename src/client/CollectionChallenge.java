package client;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import model.Books;
import model.Libraries;
import service.AddLibrary;

public class CollectionChallenge {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		DisplayMenu menu = new DisplayMenu();
		
		Map<Libraries, Set<Books>> libraryMap = new HashMap<Libraries, Set<Books>>();
		int choice = 0;

		do {
			menu.Menu();
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Library Details: ");
				AddLibrary add = new AddLibrary();
				libraryMap.putAll(add.addLibBooks(libraryMap));
				System.out.println("Library Added Successfully!");
				break;
			case 2:
				
				
				displayLibs(libraryMap);
				
				break;
			case 3:
				System.out.println("Enter the library name which books you want to sort: ");
				String libName = scanner.next();
				
				Libraries lib = null;
				
				for (Libraries libtobk : libraryMap.keySet()) {
					
					if (libName.equals(libtobk.getLibrary_name())) {
						
						lib = libtobk;
						
						break;
					}
					
				}
				if(lib == null) {
					System.out.println("Library Does not exist!");
				}else {
					
				//Set<Books> libkey = libraryMap.get(libName);
					
				System.out.println("Books For Library: "+libName);
				List<Books> sortByPrice = sortPrice(libraryMap.get(lib));
				
				displaySortedBooks(sortByPrice);
				}
				
				break;
				
			default:
				System.out.println("You entered wrong choice!!!");
				break;
			}

		} while (choice != 4);

		System.out.println("Exited!!!");
		scanner.close();
	}

	private static void displaySortedBooks(List<Books> sortByPrice) {
		for (Books books : sortByPrice) {
			System.out.println("BOOK ID: "+books.getBook_id());
			System.out.println("BOOK NAME"+books.getBook_name());
			System.out.println("BOOK PRICE"+books.getBook_price());
		}
		
	}

	//Sort In Ascending
	private static List<Books> sortPrice(Set<Books> set) {

		List<Books> sortedBooks = new ArrayList<Books>();
		
		for (Books books : set) {
			sortedBooks.add(books);
		}
		
		Collections.sort(sortedBooks);
		
		return sortedBooks;
	}

	//Display Lib and books
	private static void displayLibs(Map<Libraries, Set<Books>> libraryMap) {
		
		 
		
		List<Libraries> sortedlibs = new ArrayList<Libraries>();
		
		for (Libraries libs : libraryMap.keySet()) {
			sortedlibs.add(libs);
		}
		
		Collections.sort(sortedlibs);
		
		System.out.println("Sorted Libraries: ");
		
		for (Libraries libraries : sortedlibs) {
			
			System.out.println("LIB ID:"+libraries.getLibrary_id());
			System.out.println("LIB NAME:"+libraries.getLibrary_name());
			
			//soting books
			List<Books> sortByPrice = sortPrice(libraryMap.get(libraries));
			displaySortedBooks(sortByPrice);
		
		}

		
		
	}

}


