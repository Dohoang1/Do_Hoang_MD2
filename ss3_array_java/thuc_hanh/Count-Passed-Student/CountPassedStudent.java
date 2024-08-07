import java.util.Scanner;

public class CountPassedStudent {
    public static void main(String[] args) {

        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the size: ");
            size = sc.nextInt();
            if (size < 0 || size > 30) {
                System.out.println("Size must be between 0 and 30");
            }
        } while (size < 0 || size > 30);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                System.out.print("Enter a mark for student " + (i + 1) + ": ");
                array[i] = sc.nextInt();
                if (array[i] < 0 || array[i] > 10) {
                    System.out.println("Invalid mark. Marks should be between 0 and 10.");
                } else {
                    break;
                }
            }
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print("\t" + array[j]);
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }

}
