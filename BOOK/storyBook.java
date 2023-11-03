import java.lang.*;

public class storyBook extends Book {
    String category;
    double discountRate;

    public storyBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            String category, double discountRate) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
        this.discountRate = discountRate;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Book category is: " + category);
        System.out.println("Discount rate is: " + discountRate);
    }

    public void setDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
