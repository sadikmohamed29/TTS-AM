import java.util.ArrayList;
public class Library {
  private static final String hours = "Libraries are open daily from 9am to 5pm.";
  private static final String[] addresses = {"10 Main St.", "228 Liberty St."};

  private String address;
  private ArrayList<Book> books;

  public Library(String address) {
    this.address = address;
    this.books = new ArrayList<Book>();
  }

  public static String getHours() {
    return hours;
  }

  public static String[] getAddresses() {
    return addresses;
  }

  public String getAddress() {
    return this.address;
  }

  public ArrayList<Book> getBooks() {
    return this.books;
  }

  public void addBook(Book book) {
    this.books.add(book);
  }

  public void borrowBook(String title) {
    for (Book book: this.books) {
      if (book.getTitle().equals(title)) {
        if (!book.isRented()) {
          book.borrow();
          System.out.println("You successfully borrowed " + title);
          return;
        }
        System.out.println("Sorry, this book is already borrowed.");
        return;
      }
    }
    System.out.println("Sorry, this book is not in our catalog.");
  }

  public void returnBook(String title) {
    for (Book book: this.books) {
      if (book.getTitle().equals(title)) {
        if (book.isRented()) {
          book.returnBook();
          System.out.println("You successfully returned " + title);
          return;
        }
        System.out.println("Sorry, this book is not borrowed.");
        return;
      }
    }
    System.out.println("Sorry, this book is not in our catalog.");
  }

  public void printAvailableBooks() {
    if (this.books.size() == 0) {
      System.out.println("No book in catalog");
      return;
    }
    for (Book book: this.books) {
      if (!book.isRented()) {
        System.out.println(book.getTitle());
      }
    }
  }
}
