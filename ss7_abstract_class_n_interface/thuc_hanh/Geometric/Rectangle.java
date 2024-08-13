public class Rectangle extends Shape{
    private double width;
    private double lenght;

    public Rectangle() {
        this.width = 1.0;
        this.lenght = 1.0;
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return width * lenght;
    }
    public double getPerimeter() {
        return 2 * width + 2 * lenght;
    }

    @Override

    public String toString() {
        return "A Rectangle with width: " + this.getWidth() + " and length: " + this.getLenght() +", which is a subclass of " + super.toString();
    }
}
