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
    public double getAmount() {
        return (double) getWeigth() * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }


    @Override
    public double getRealMoney() {
        LocalDate todayDate = LocalDate.now();
        if (todayDate.isBefore(getExpiryDate())
                && (todayDate.isAfter(getExpiryDate().minusDays(5)))
                || todayDate.isEqual(getExpiryDate().minusDays(5))) {
            System.out.println("Discount 30%");
            return getAmount() * 0.7;
        } else if (todayDate.isBefore(getExpiryDate())
                && (todayDate.isEqual(getManufacturingDate()))
                || todayDate.isAfter(getManufacturingDate())) {
            return getAmount() * 0.9;
        } else {
            System.out.println("Invalid data");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weigth=" + weigth +
                "} " + super.toString();
    }
}
