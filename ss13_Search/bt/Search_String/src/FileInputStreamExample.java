import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        // Tạo một FileInputStream để đọc dữ liệu từ file "output.dat"
        try (FileInputStream fis = new FileInputStream("output.dat")) {
            int content;

            // Đọc từng byte từ file và hiển thị nó dưới dạng ký tự
            while ((content = fis.read()) != -1) {
                // Chuyển đổi byte thành ký tự và in ra
                System.out.print((char) content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
