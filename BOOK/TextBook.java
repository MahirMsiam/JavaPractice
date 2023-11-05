import java.lang.*;

public class TextBook extends Book {
    String subject;
    int standard;

    public TextBook() {
        //System.out.println("Emoty constructor");
    }

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            String subject, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.subject = subject;
        this.standard = standard;
    }

    public void setsubject(String subjecct) {
        this.subject = subjecct;
    }

    public void setStandard(int Standard) {
        this.standard = standard;
    }

    public String getSubject() {
        return subject;
    }

    public int getStandard() {
        return standard;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Subject name is: " + subject);
        System.out.println("Standard is : " + standard);
    }

}
