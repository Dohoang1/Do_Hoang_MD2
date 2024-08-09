import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = sc.nextDouble();

        Rectangle rect = new Rectangle(width, height);

        System.out.println("Your rectangle is \n" + rect.display());
        System.out.println("Perimeter of your rectangle is: " + rect.getPerimeter());
        System.out.println("Area of your rectangle is: " + rect.getArea());
    }
}
