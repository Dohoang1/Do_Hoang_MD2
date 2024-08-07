import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rate = 25132.5;
        System.out.println("Enter VND to convert to USD: ");
        double vnd = scanner.nextDouble();
        double vndToUsd = vnd / rate;
        System.out.printf("USD is %.2f!",vndToUsd);
    }
}
