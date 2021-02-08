package libraryLab;

import java.util.List;

public class Library {
	private String address;	
	private List<Book> catalog;
	
	public Library() {}
	
	public Library(String address) {
		this.address = address;
	}
	
	public void addBook(Book newBook) {
		catalog.add(newBook);
	}
	
	public static void printOpeningHours() {
		System.out.println("Daily from 9am to 5pm.");
	}
	
	public void printAddress() {
		System.out.println(this.address);
	}
	
	public void borrowBook(String title) {
		
	}
	
	
	
	
}
