public class Circle {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}

