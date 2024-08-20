public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    abstract void display();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
