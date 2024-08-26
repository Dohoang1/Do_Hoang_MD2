import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {

    Stack <String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();

        System.out.println("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String strA = input.nextLine();
        strA = strA.toLowerCase();

        for (int i = 0; i < strA.length(); i++) {
             stack.push(String.valueOf(strA.charAt(i)));
             queue.add(String.valueOf(strA.charAt(i)));
        }

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
        input.close();
    }
}
