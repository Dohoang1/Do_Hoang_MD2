public class TaxiExpenses implements Calculate {
    private double times;

    public TaxiExpenses(double times) {
        this.times = times;
    }

    public double getTimes() {
        return times;
    }

    @Override
    public double calculate() {
        return getTimes() * 100000;
    }
}