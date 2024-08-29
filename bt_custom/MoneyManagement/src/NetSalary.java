public class NetSalary implements Calculate {
    private double salary;

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