import java.util.Scanner;

public class PrintGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print rectangle");
            System.out.println("2. Print square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for ( int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 11 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2 :
                    int choice2 = -1;
                    while (choice2 != 5) {
                    System.out.println("Choose type of square triangle");
                    System.out.println("1. Top-left square corner");
                    System.out.println("2. Top-right square corner");
                    System.out.println("3. Bottom-left square corner");
                    System.out.println("4. Bottom-right square corner");
                    System.out.println("5. Return");
                    System.out.println("Enter your choice: ");
                    choice2 = sc.nextInt();

                    switch (choice2) {
                        case 1:
                            for ( int i = 7; i >= 1; i--) {
                                for (int j = 1; j <= i ; j++) {
                                    if (j <= i) {
                                        System.out.print("*");
                                    } else System.out.println(" ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 0; i < 7; i++) {
                                for (int j = 0; j < 7; j++) {
                                    if (j < i) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for ( int i = 1; i <= 7; i++) {
                                for ( int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for ( int i = 7; i >= 0; i--) {
                                for (int j = 0; j <= 7; j++) {
                                    if (j <= i) {
                                        System.out.print(" ");
                                    } else System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 5:
                        break;
                        default: System.out.println("Invalid choice");
                    }
                    }
                    break;
                case 3:

                    for (int i = 1; i <= 5; i++) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4: System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}


