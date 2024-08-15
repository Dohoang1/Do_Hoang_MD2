public class FullTimeStaff extends Staff{
    private double bonus;
    private double penalty;
    private double baseSalary;

    public FullTimeStaff(String id, String name, int age, String phone, String email, double bonus, double penalty, double baseSalary) {
        super(id, name, age, phone, email);
        this.bonus = bonus;
        this.penalty = penalty;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "FullTimeStaff{" +
                "bonus=" + bonus +
                ", penalty=" + penalty +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus - penalty;
    }
}