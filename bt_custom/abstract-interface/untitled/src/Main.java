public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle("red",4);
        Rectangle rectangle1 = new Rectangle("green", 2,4);
        Triangle triangle1 = new Triangle("blue",3,3,3);


        System.out.println(circle1);
        System.out.println(rectangle1);
        System.out.println(triangle1);


        System.out.printf("circle1 with area is %.2f and perimeter is %.2f%n", circle1.calculateArea(), circle1.calculatePerimeter());
        System.out.printf("rectangle1 with area is %.2f and perimeter is %.2f%n", rectangle1.calculateArea(), rectangle1.calculatePerimeter());
        System.out.printf("triangle1 with area is %.2f and perimeter is %.2f%n", triangle1.calculateArea(), triangle1.calculatePerimeter());


    }
}