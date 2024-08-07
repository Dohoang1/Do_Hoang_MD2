import java.util.Scanner;

public class ConvertTemp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f;
        double c;

        int choice;

        do {
            System.out.println("Menu. ");
            System.out.println("1.F to C");
            System.out.println("2.C to F");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter F: ");
                    f = sc.nextDouble();
                    System.out.println("C is: " + fToC(f));
                    break;
                }
                case 2: {
                    System.out.println("Enter C: ");
                    c = sc.nextDouble();
                    System.out.println("F is: " + cToF(c));
                    break;
                }
                case 0: System.exit(0);
            }
        } while (choice != 0);
    }
    public static double cToF (double c) {
        double f = (9.0 / 5) * c + 32.0;
        return f;
    }

    public static double fToC (double f) {
        double c = (5.0 / 9) * (f - 32.0);
        return c;
    }
}
