import java.lang.*;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        
        // TEXT BOOK DEMONSTRATION
        System.out.println("---------TEXT BOOK----------");
        TextBook tb = new TextBook();
        System.out.println("--------Set Detail--------");
        tb.setIsbn("SFFG65465");
        System.out.println("your Book ISBN here: " + tb.getIsbn());
        tb.setBookTitle("TEXTBook");
        System.out.println("your Book title here: " + tb.getBookTitle());
        tb.setAuthorName("TEXT BOOK Author");
        System.out.println("author name here: " + tb.getAuthorName());
        tb.setPrice(50);
        System.out.println("Book's price here: " + tb.getPrice());
        tb.setAvaiableQuantity(100);
        System.out.println("available Quanntity here: " + tb.getAvailableQuantity());
        tb.setsubject("Physics2");
        System.out.println("Subject is :" + tb.getSubject());
        tb.setStandard(12);
        System.out.println("Standard is: " + tb.getStandard());
        TextBook tb1 = new TextBook("SGF555", "TEXTBOOK", "SHAJAHAN TAPAN", 250, 250,
                "PHYSICS", 12);
        tb1.showDetails();

        // STORY BOOK DEMONSTRATION USING ARRAY AND LOOP

        System.out.println("------StoryBook------");
        storyBook sb1 = new storyBook("A555", "bookTitle", "authorName", 255, 5, "A", 15.62);
        sb1.showDetails();
        System.out.println("---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Books  do you Want? ");
        int sbnumber = sc.nextInt();
        sc.nextLine();
        storyBook[] sbarr = new storyBook[sbnumber];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your book's details here : ");
            System.out.print("ISBN: ");
            String isbn = sc.nextLine();
            System.out.print("Enter your Book title here: ");
            String bookTitle = sc.nextLine();
            System.out.print("Enter author name here: ");
            String authorName = sc.nextLine();
            System.out.print("Enter Book's price here: ");
            double price = sc.nextDouble();
            sc.nextLine();// solution for overlapping(ref: BRO code yt)
            System.out.print("ENter available Quanntity here: ");
            int availableQuantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter book category here: ");
            String category = sc.nextLine();
            System.out.print("Enter Discount rate here: ");
            double discountRate = sc.nextDouble();
            sc.nextLine();
            storyBook sb = new storyBook(isbn, bookTitle, authorName, price, availableQuantity, category, discountRate);
            sbarr[i] = sb; // every index is part of object sb
        }
        for (storyBook sb : sbarr) {
            System.out.println("______________________");
            sb.showDetails(); // Printing all the book details seperately using array loop
            System.out.println("______________________");// looks good 0_0
        }
        sc.close();// gotta stop what started

    }
}
