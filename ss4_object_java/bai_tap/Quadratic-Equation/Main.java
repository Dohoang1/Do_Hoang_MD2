import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input value for a: ");
        double a = sc.nextDouble();
        System.out.println("Input value for b: ");
        double b = sc.nextDouble();
        System.out.println("Input value for c: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("The equation has 2 solution: " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root = equation.getRoot1();
            System.out.println("The equation has 1 solution: " + root);
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
