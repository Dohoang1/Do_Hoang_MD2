public class FictionBook extends Book {
    private String category;

    public FictionBook(String bookCoode, String name, double price, String author, String category) {
        super(bookCoode,name,price,author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.93;
    }
}