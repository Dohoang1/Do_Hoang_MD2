import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String word = sc.nextLine();

        LinkedList<Character> sortedWord = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (sortedWord.isEmpty() || currentChar > sortedWord.getLast()) {
                sortedWord.add(currentChar);
            }
        }

        String result = "";
        for ( int i = 0; i < sortedWord.size(); i++ ) {
            result += sortedWord.get(i);
        }

        System.out.println("Chuoi tang dan lon nhat la: " + result);
    }
}