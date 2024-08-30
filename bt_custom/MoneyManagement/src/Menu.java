import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu {
    private CalculateMethods calculateMethods;

    public Menu() {
        calculateMethods = new CalculateMethods();
    }

    public void displayMenu() {
        DecimalFormat currencyFormat = new DecimalFormat("#,##0");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Calculate Electric Bill.");
            System.out.println("2. Calculate Taxi Fee");
            System.out.println("3. Calculate Net Salary");
            System.out.println("4. Get Total Income After All Spending");
            System.out.println("=> Please select function [1->4] or press other numbers to exit the program:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    calculateMethods.calculateElectricBill(sc, currencyFormat);
                    break;
                case 2:
                    calculateMethods.calculateTaxiBill(sc, currencyFormat);
                    break;
                case 3:
                    calculateMethods.calculateNetSalary(sc, currencyFormat);
                    break;
                case 4:
                    calculateMethods.totalExpense(currencyFormat);
                    break;
                default:
                    System.out.println("Thank You For Using The Program!");
                    break;
            }
        }
        while (choice >= 1 && choice <= 4);
        sc.close();
    }
}
