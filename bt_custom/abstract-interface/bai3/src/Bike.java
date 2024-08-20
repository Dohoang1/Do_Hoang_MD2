public class Bike extends Vehicle {
    private String color;
    private String brand;

    public Bike(String name, double speed, String color, String brand) {
        super(name, speed);
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.printf("%s start \n", getName());
    }

    @Override
    public void stop() {
        System.out.printf("%s stop \n", getName());
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                "} " + super.toString();
    }
}
