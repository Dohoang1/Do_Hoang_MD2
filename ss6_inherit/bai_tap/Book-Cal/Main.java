public class Main {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook("b1", "Its JS", 30000.0, "James", "JavaScript", "IDK");
        ProgrammingBook book2 = new ProgrammingBook("b2", "Java is so hard", 50000.0, "Bob", "Java", "IDK");
        ProgrammingBook book3 = new ProgrammingBook("b3", "JavaGod", 60000.0, "Hoang", "Java", "IDK");

        FictionBook book4 = new FictionBook("b4", "WTF", 40000.0, "Noob", "Vien tuong 1");
        FictionBook book5 = new FictionBook("b5", "UFO", 130000.0, "Pinoy", "Vien tuong 2");
        FictionBook book6 = new FictionBook("b6", "OMG", 50000.0, "Idiot", "Vien tuong 3");

        double sumPrice = 0;
        int javaBookCount = 0;
        int vienTuongCount = 0;
        int cheap = 0;
    Book [] books = {book1, book2, book3, book4, book5, book6};


        sumPrice = getSumPrice(books, sumPrice);

        String keyword1 = "Java";
        javaBookCount = getJavaBookCount(books, javaBookCount, keyword1);

        String keyword2 = "Vien tuong 1";

        vienTuongCount = getVienTuongCount(books, vienTuongCount, keyword2);

        cheap = getCheap(books, cheap);


        System.out.println("Tong so tien cua 6 sach la: " + sumPrice);
        System.out.println("Tong so sach Java la: " + javaBookCount);
        System.out.println("Tong so sach Vien tuong 1 la: " + vienTuongCount);
        System.out.println("Tong so sach Fiction co gia < 100000 la: " + cheap);

    }

    private static int getCheap(Book[] books, int cheap) {
        for (int i = 0; i < books.length; i++ ) {
            if (books[i] instanceof FictionBook) {
                if (books[i].getPrice() < 100000) {
                    cheap++;
                }
            }
        }
        return cheap;
    }

    private static int getVienTuongCount(Book[] books, int vienTuongCount, String keyword2) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) books[i];
                if (keyword2.equals(fictionBook.getCategory())) {
                    vienTuongCount++;
                }
            }
        }
        return vienTuongCount;
    }

    private static int getJavaBookCount(Book[] books, int javaBookCount, String keyword) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgrammingBook) {
                ProgrammingBook programmingBook = (ProgrammingBook) books[i];
                if (keyword.equals(programmingBook.getLanguage())) {
                    javaBookCount++;
                }
            }
        }
        return javaBookCount;
    }

    private static double getSumPrice(Book[] books, double sumPrice) {
        for (int i = 0; i < books.length; i++) {
            sumPrice += books[i].getPrice();
        }
        return sumPrice;
    }
}
