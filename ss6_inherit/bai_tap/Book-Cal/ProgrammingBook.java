public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook(String bookCoode, String name, double price, String author, String language, String framwork) {
        super(bookCoode,name,price,author);
        this.language = language;
        this.framework = framwork;
    }

    public String getLanguage() {
        return language;
    }
    public String getFramework() {
        return framework;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.95;
    }

}
