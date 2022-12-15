
public class Book {
  private String title;
  private boolean isRented;

  public Book(String title) {
    this.title = title;
    this.isRented = false;
  }

  public String getTitle() {
    return this.title;
  }

  public boolean isRented() {
    return this.isRented;
  }

  public void borrow() {
    this.isRented = true;
  }

  public void returnBook() {
    this.isRented = false;
  }
}
