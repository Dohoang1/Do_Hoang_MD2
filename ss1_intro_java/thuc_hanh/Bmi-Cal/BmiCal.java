import java.util.Scanner;

public class BmiCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weigth , height, bmi;
        System.out.print("Your weight in kg: ");
        weigth = scanner.nextDouble();

        System.out.print("Your height in cm: ");
        height = scanner.nextDouble();

        bmi = weigth / Math.pow((height / 100), 2);

       if (bmi < 18) System.out.printf("%-20.2f%s", bmi, "Underweigth");
       else if (bmi < 25) System.out.printf("%-20.2f%s", bmi, "Normal");
       else if (bmi < 30) System.out.printf("%-20.2f%s", bmi, "Overweigth");
       else System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
