import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String data = "Hello, FileOutputStream!";
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("output.dat");
            // Chuyển chuỗi thành mảng byte
            byte[] byteArray = data.getBytes();

            // Ghi mảng byte vào file
            fos.write(byteArray);

            System.out.println("Data has been written to output.dat");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}