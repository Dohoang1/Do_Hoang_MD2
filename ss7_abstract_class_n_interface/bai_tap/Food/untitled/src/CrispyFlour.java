import java.time.LocalDate;

public class CrispyFlour extends Material {
    private double quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount (int cost, double quantity) {
        return (double) quantity * cost;
    }

    @Override
    public LocalDate getExpiryDate () {
        return getManufacturingDate().plusYears(1);
    }


    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                "} " + super.toString();
    }
}
