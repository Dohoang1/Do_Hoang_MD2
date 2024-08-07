import java.util.Scanner;

public class StrCheck {
    public static void main(String[] args) {
        String str1 = "abcrj3498jfiok32dkjfdadnjdfj230923kpdesdk23j23duk";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character you want to check: ");
        char char1 = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == char1) {
                count++;
            }
        }
        System.out.println("Character " + char1 + " is appears " + count + " times in string  ");
    }
}
