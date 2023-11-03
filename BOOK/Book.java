import java.lang.*;

public class Book {

	String isbn;
	String bookTitle;
	String authorName;
	double price;
	int availableQuantity;

	public Book() {
		System.out.println("Empty construcctor");
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAvaiableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public double getPrice() {
		return price;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;

	}

	public void addQuantity(int amount) {
		amount = Math.abs(amount);
		availableQuantity = availableQuantity + amount;
		System.out.println("available Quantity is :" + availableQuantity);
	}

	public void sellQuantity(int amount) {
		amount = Math.abs(amount);
		availableQuantity = availableQuantity - amount;
		System.out.println("available Quantity is :" + availableQuantity);
	}

	public void showDetails() {
		System.out.println("ISBN is: " + isbn);
		System.out.println("Book title is: " + bookTitle);
		System.out.println("Author name is: " + authorName);
		System.out.println("price is: " + price);
		System.out.println("Available Quantity is: " + availableQuantity);

	}

}
