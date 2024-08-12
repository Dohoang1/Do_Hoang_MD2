public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle() {
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 + Math.PI * radius;
    }

    @Override
    public String toString() {
        return "This Circle is " + getColor() + ", with a radius is " + getRadius() + ", area is " + getArea() + " and perimeter is " + getPerimeter();
    }
}
