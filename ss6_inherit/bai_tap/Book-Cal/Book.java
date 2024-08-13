public class Book {
    private String bookCode;
    private String name;
    private double price;
    private String author;
    private int amount;

    public Book(String bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        this.amount++;
    }

    public String getBookCode() {
        return bookCode;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getAuthor() {
        return author;
    }
    public int getAmount() {
        return amount;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}