package libraryLab;

public class Book {
	
	String title;
    boolean borrowed = false;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
    }
   
    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    	this.borrowed = true; 
    }
   
    // Marks the book as not rented
    public void returned() {
        // Implement this method
    	this.borrowed = false;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
    	return borrowed;
    }
   
    // Returns the title of the book
    public String getTitle() {
//        this.title;
    }

//    public static void main(String[] arguments) {
       
    }
	
	
	
}
