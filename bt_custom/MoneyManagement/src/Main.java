import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static ElectricBill electricBill;
    private static TaxiExpenses taxiExpenses;
    private static NetSalary netSalary;

    public static void main(String[] args) {
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
                    calculateElectricBill(sc, currencyFormat);
                    break;
                case 2:
                    calculateTaxiBill(sc, currencyFormat);
                    break;
                case 3:
                    calculateNetSalary(sc, currencyFormat);
                    break;
                case 4:
                    totalExpense(currencyFormat);
                    break;
                default:
                    System.out.println("Thank You For Using The Program!");
                    break;
            }
        }
        while (choice >= 1 && choice <= 4);
        sc.close();
    }
    

    private static void calculateNetSalary(Scanner sc, DecimalFormat currencyFormat) {
        System.out.println("Calculate Net Salary");
        System.out.println("Please Enter Gross Salary: ");
        netSalary = new NetSalary(Integer.parseInt(sc.nextLine()));
        System.out.println("Net Salary is: " + currencyFormat.format(netSalary.calculate()));
    }

    private static void calculateTaxiBill(Scanner sc, DecimalFormat currencyFormat) {
        System.out.println("Calculate Taxi Fee");
        System.out.println("Please Enter Times Travel By Taxi: ");
        taxiExpenses = new TaxiExpenses(Integer.parseInt(sc.nextLine()));
        System.out.println("Taxi Expenses is: " + currencyFormat.format(taxiExpenses.calculate()));
    }

    private static void calculateElectricBill(Scanner sc, DecimalFormat currencyFormat) {
        System.out.println("Calculate Electric Bill");
        System.out.println("Please Enter a Electric Usage Numbers: ");
        electricBill = new ElectricBill(Integer.parseInt(sc.nextLine()));
        System.out.println("Electric Bill is: " + currencyFormat.format(electricBill.calculate()));
    }

    private static void totalExpense(DecimalFormat currencyFormat) {
        System.out.println("Get Total Income After All Spending");
        try {
            if (electricBill == null || taxiExpenses == null || netSalary == null) {
                throw new IllegalStateException("Requested Data Not Entered, Please Input 1, 2, 3 First!");
            }
            double totalIncome = netSalary.calculate() - taxiExpenses.calculate() - electricBill.calculate();
            System.out.println("Total Income After All Spending: ");
            System.out.println(currencyFormat.format(netSalary.calculate()) +
                    " - " + currencyFormat.format(taxiExpenses.calculate()) +
                    " - " + currencyFormat.format(electricBill.calculate()));
            System.out.println("= " + currencyFormat.format(totalIncome));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}