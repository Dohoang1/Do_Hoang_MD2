public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape("red",true);
        System.out.println(shape1);

        Circle circle1 = new Circle(3.0,"blue",true);
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle(2.0,3.0,"green",false);
        System.out.println(rectangle1);

        Square square1 = new Square(4.0,"yellow",true);
        System.out.println(square1);
    }
}
