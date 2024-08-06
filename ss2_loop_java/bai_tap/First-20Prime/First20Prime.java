import java.util.Scanner;

public class First20Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of prime-numbers you want to show: ");
        int nums = sc.nextInt();

        int count = 0;

        int n = 2;

        while (count < nums) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number");
            count++;
        }
        n++;
        }
    }
}