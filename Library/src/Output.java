
public class Output {
	public static void main(String[] args) {
		  // Create two libraries
		  Library firstLibrary = new Library("10 Main St.");
		  Library secondLibrary = new Library("228 Liberty St.");

		  // Add some books to the first library
		  firstLibrary.addBook(new Book("The Da Vinci Code"));
		  firstLibrary.addBook(new Book("Le Petit Prince"));
		  firstLibrary.addBook(new Book("A Tale of Two Cities"));

		  // Print the hours and addresses of the libraries
		  System.out.println("Library hours:");
		  System.out.println(Library.getHours());
		  System.out.println();

		  System.out.println("Library addresses:");
		  for (String address: Library.getAddresses()) {
		    System.out.println(address);
		  }
		  System.out.println();

		  // Try to borrow The Lords of the Rings from both libraries
		  System.out.println("Borrowing The Lord of the Rings:");
		  firstLibrary.borrowBook("The Lord of the Rings");
		  firstLibrary.borrowBook("The Lord of the Rings");
		  secondLibrary.borrowBook("The Lord of the Rings");
		  System.out.println();

		  // Print the titles of all available books from the first library
		  System.out.println("Books available in the first library:");
		  firstLibrary.printAvailableBooks();
		  System.out.println();

		  // Print the titles of all available books from the second library
		  System.out.println("Books available in the second library:");
		  secondLibrary.printAvailableBooks();
		  System.out.println();

		  // Return The Lords of the Rings to the first library
		  System.out.println("Returning The Lord of the Rings:");
		  firstLibrary.returnBook("The Lord of the Rings");

		  // Print the titles of available books from the first library again
		  System.out.println("Books available in the first library:");
		  firstLibrary.printAvailableBooks();
		  System.out.println();
		}


}
