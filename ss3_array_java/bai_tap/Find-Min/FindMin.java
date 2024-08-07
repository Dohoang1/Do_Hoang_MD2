import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element for index " + i + " of the array: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        int min_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_index = i;
            }
        }
        System.out.println("\nThe minimum element is " + min + " at index " + min_index);

    }


}
