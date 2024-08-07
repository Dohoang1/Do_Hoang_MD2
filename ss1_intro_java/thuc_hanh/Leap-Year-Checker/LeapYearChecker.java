import java.util.Scanner;

import static java.lang.Double.isNaN;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        boolean isLeapYear;

        boolean isDivBy4 = year % 4 == 0;
        if (isDivBy4) {
            boolean isDivBy100 = year % 100 == 0;
            if (isDivBy100) {
                boolean isDivBy400 = year % 400 == 0;
                if (isDivBy400) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }


        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }

}
