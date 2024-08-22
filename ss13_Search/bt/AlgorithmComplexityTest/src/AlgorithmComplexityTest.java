import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inputStr = sc.nextLine();

        int [] frequentChar = new int[255];
        for (int i = 0; i < inputStr.length(); i++) {
            int ascii = (int) inputStr.charAt(i);
            frequentChar[ascii]++;
        }

        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("Most appear letter is: " + character + " with a frequency of " + max + " times");
    }
}
