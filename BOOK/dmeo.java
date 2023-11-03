import java.lang.*;
import java.util.*;

public class dmeo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    int numberOfBooks;

    System.out.print("Enter the number of books you want to add: ");
    numberOfBooks = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < numberOfBooks; i++) {
      System.out.println("Which type of book do you want to add (Enter 'book', 'story', 'text')?");
      String bookType = scanner.nextLine();

      Book book;

      if (bookType.equalsIgnoreCase("book")) {
        book = createBook(scanner);
      } else if (bookType.equalsIgnoreCase("story")) {
        book = createStoryBook(scanner);
      } else if (bookType.equalsIgnoreCase("text")) {
        book = createTextBook(scanner);
      } else {
        System.out.println("Invalid input. Please enter 'book', 'story', or 'text'.");
        i--;
        continue;
      }

      books.add(book);
    }

    System.out.println("Selected books:");
    for (Book book : books) {
      book.showDetails();
      System.out.println();
    }

    scanner.close();
  }

  // THIS PART IS TO TAKE BOOK INFOS
  private static Book createBook(Scanner scanner) {
    System.out.print("Enter ISBN: ");
    String isbn = scanner.nextLine();
    System.out.print("Enter Book Title: ");
    String bookTitle = scanner.nextLine();
    System.out.print("Enter Author Name: ");
    String authorName = scanner.nextLine();
    System.out.print("Enter Price: ");
    double price = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Enter Available Quantity: ");
    int availableQuantity = scanner.nextInt();
    scanner.nextLine();

    return new Book(isbn, bookTitle, authorName, price, availableQuantity);
  }

  private static Book createStoryBook(Scanner scanner) {
    System.out.print("Enter ISBN: ");
    String isbn = scanner.nextLine();
    System.out.print("Enter Book Title: ");
    String bookTitle = scanner.nextLine();
    System.out.print("Enter Author Name: ");
    String authorName = scanner.nextLine();
    System.out.print("Enter Price: ");
    double price = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Enter Available Quantity: ");
    int availableQuantity = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter Category: ");
    String category = scanner.nextLine();
    System.out.print("Enter Discount Rate: ");
    double discountRate = scanner.nextDouble();
    scanner.nextLine();

    return new storyBook(isbn, bookTitle, authorName, price, availableQuantity, category, discountRate);
  }

  private static Book createTextBook(Scanner scanner) {
    System.out.print("Enter ISBN: ");
    String isbn = scanner.nextLine();
    System.out.print("Enter Book Title: ");
    String bookTitle = scanner.nextLine();
    System.out.print("Enter Author Name: ");
    String authorName = scanner.nextLine();
    System.out.print("Enter Price: ");
    double price = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Enter Available Quantity: ");
    int availableQuantity = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter Subject: ");
    String subject = scanner.nextLine();
    System.out.print("Enter Standard: ");
    int standard = scanner.nextInt();
    scanner.nextLine();

    return new TextBook(isbn, bookTitle, authorName, price, availableQuantity, subject, standard);
  }
}
