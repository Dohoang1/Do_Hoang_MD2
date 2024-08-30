import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateMethods {
    private ElectricBill electricBill;
    private TaxiExpenses taxiExpenses;
    private NetSalary netSalary;

    public void calculateNetSalary(Scanner sc, DecimalFormat currencyFormat) {
        System.out.println("Calculate Net Salary");
        System.out.println("Please Enter Gross Salary: ");
        netSalary = new NetSalary(Integer.parseInt(sc.nextLine()));
        System.out.println("Net Salary is: " + currencyFormat.format(netSalary.calculate()));
    }

    public void calculateTaxiBill(Scanner sc, DecimalFormat currencyFormat) {
        System.out.println("Calculate Taxi Fee");
        System.out.println("Please Enter Times Travel By Taxi: ");
        taxiExpenses = new TaxiExpenses(Integer.parseInt(sc.nextLine()));
        System.out.println("Taxi Expenses is: " + currencyFormat.format(taxiExpenses.calculate()));
    }

    public void calculateElectricBill(Scanner sc, DecimalFormat currencyFormat) {
        System.out.println("Calculate Electric Bill");
        System.out.println("Please Enter Electric Usage Numbers: ");
        electricBill = new ElectricBill(Integer.parseInt(sc.nextLine()));
        System.out.println("Electric Bill is: " + currencyFormat.format(electricBill.calculate()));
    }

    public void totalExpense(DecimalFormat currencyFormat) {
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
