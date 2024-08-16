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
    public double getAmount() {
        return (double) getQuantity() * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate todayDate = LocalDate.now();
        if (todayDate.isBefore(getExpiryDate())
                && (todayDate.isAfter(getExpiryDate().minusDays(5)))
                || todayDate.isEqual(getExpiryDate().minusDays(5))) {
            System.out.println("Discount 30%");
            return getAmount() * 0.8;
        } else if (todayDate.isBefore(getExpiryDate())
                && (todayDate.isEqual(getManufacturingDate()))
                || todayDate.isAfter(getManufacturingDate())) {
            return getAmount() * 0.95;
        } else {
            System.out.println("Invalid data");
        }
        return 0;
    }


    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                "} " + super.toString();
    }
}
