import java.time.LocalDate;

public abstract class Material implements Discount, Comparable<Material> {
    private String id;
    private String name;
    private LocalDate manufacturingDate ;
    private double cost;

    @Override
    public int compareTo(Material o) {
        return this.id.compareTo(o.id);
    }

    public Material() {
        this.id = "";
        this.name = "";
        this.manufacturingDate = null;
        this.cost = 0;
    }

    public Material(String id, String name, LocalDate manufacturingDate, double cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract double getAmount(int cost, double quantity);

    public abstract LocalDate getExpiryDate();

    @Override
    public double getRealMoney() {
        return getCost();
    }

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
