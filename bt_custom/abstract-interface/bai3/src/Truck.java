public class Truck extends Vehicle implements Fuelable {
    private String color;
    private String brand;
    private double fuel;

    public Truck(String name, double speed, String color, String brand, double fuel) {
        super(name, speed);
        this.color = color;
        this.brand = brand;
        this.fuel = fuel;
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

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
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
    public void refuel() {
        setFuel(100);
        System.out.printf("%s fuel is: %.2f\n", getName() ,getFuel());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", fuel=" + fuel +
                "} " + super.toString();
    }
}
