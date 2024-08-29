import java.text.DecimalFormat;
import java.util.Scanner;

public class NetSalary implements Calculate {
    private double salary;
    DecimalFormat currencyFormat = new DecimalFormat("#,##0");

    public NetSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calculate() {
        return getSalary() * 0.85;
    }

}