public class Main {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook("b1", "Its JS", 30000.0, "James", "JavaScript", "IDK");
        ProgrammingBook book2 = new ProgrammingBook("b2", "Java is so hard", 50000.0, "Bob", "Java", "IDK");
        ProgrammingBook book3 = new ProgrammingBook("b3", "JavaGod", 60000.0, "Hoang", "Java", "IDK");

        FictionBook book4 = new FictionBook("b4", "WTF", 40000.0, "Noob", "Vien tuong 1");
        FictionBook book5 = new FictionBook("b5", "UFO", 130000.0, "Pinoy", "Vien tuong 2");
        FictionBook book6 = new FictionBook("b6", "OMG", 50000.0, "Idiot", "Vien tuong 3");

        double sumPrice = 0;
        double javaBookCount = 0;
        double vienTuongCount = 0;
        int cheap = 0;
    Book [] books = {book1, book2, book3, book4, book5, book6};
        for (Book book : books) {
            sumPrice += book.getPrice();
            if (book instanceof ProgrammingBook) {
                ProgrammingBook programmingBook = (ProgrammingBook) book;
                if (programmingBook.getLanguage().equals("Java")) {
                    javaBookCount++;
                }
            }
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                if (fictionBook.getCategory().equals("Vien tuong 1")) {
                    vienTuongCount++;
                }
            }
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                if (fictionBook.getPrice() < 100000) {
                    cheap++;
                }
            }
        }
        System.out.println("Tong so tien cua 6 sach la: " + sumPrice);
        System.out.println("Tong so sach Java la: " + javaBookCount);
        System.out.println("Tong so sach Vien tuong 1 la: " + vienTuongCount);
        System.out.println("Tong so sach Fiction co gia < 100000 la: " + cheap);

    }
}
