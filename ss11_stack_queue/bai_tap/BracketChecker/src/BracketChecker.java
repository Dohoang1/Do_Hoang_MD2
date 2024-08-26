import java.util.Scanner;
import java.util.Stack;

public class BracketChecker {
    public static void main(String[] args) {
        Stack<Character> bStack = new Stack<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Operator: ");
        String operator = input.nextLine();


        for ( char sym : operator.toCharArray()) {
            if (sym == '(') {
                bStack.push(sym);
            }
            else if (sym == ')') {
                if (bStack.isEmpty()) {
                    System.out.println("Invalid bracket");;
                }
                char left = bStack.pop();
                if (left != sym) {
                    System.out.println("Invalid bracket");
                }
            }
            System.out.println("well");
        }
    }
}
