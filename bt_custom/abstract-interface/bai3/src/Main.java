public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("CX6", 100, "White", "Mazda", 0);
        Bike bike1 = new Bike("Rocker", 30, "red", "Thong Nhat");
        Truck truck1 = new Truck("Ben", 80, "green", "Huyndai", 0);

        car1.refuel();
        truck1.refuel();

        car1.start();
        bike1.start();
        truck1.start();



    }
}