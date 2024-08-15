import java.time.LocalDate;

public class Meat extends Material {
    private double weigth;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weigth) {
        super(id, name, manufacturingDate, cost);
        this.weigth = weigth;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public double getAmount(int cost, double weigth) {
        return (double) cost * weigth;
    }

    @Override
    public LocalDate getExpiryDate () {
        return getManufacturingDate().plusDays(7);
    }


    @Override
    public String toString() {
        return "Meat{" +
                "weigth=" + weigth +
                "} " + super.toString();
    }
}
