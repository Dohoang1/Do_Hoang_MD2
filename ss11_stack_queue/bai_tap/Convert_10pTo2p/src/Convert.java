import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Input a number");
            System.out.println("2. Print the number");
            System.out.println("0. Exit application");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Input number");
                    int decimalNumber = sc.nextInt();
                    while (decimalNumber > 0) {
                        int remainder = decimalNumber % 2;
                        stack1.push(remainder);
                        decimalNumber = decimalNumber / 2;
                    }
                    break;
                case 2 :
                    System.out.println("Binary number:");
                    String result = "";
                    while (!stack1.isEmpty()) {
                        result += stack1.pop() + " ";
                    }
                    System.out.println(result);
                    result = "";
                    break;
                case 0 :
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 0); {
            sc.close();
        }
    }
}
