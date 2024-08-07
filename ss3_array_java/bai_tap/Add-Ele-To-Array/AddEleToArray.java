import java.util.Scanner;

public class AddEleToArray {
    public static void main(String[] args) {
        int [] arr = {1, 5, 6, 8, 3, 9, 14, 2, 11};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the new element to be added to the array: ");
        int x = sc.nextInt();

        while (true) {

            System.out.println("Enter the index of the new element to be added to the array: ");
            int index = sc.nextInt();

            if (index < 0 || index >= arr.length-1) {
                System.out.println("Invalid index, please try again!");
            } else {

                int [] newArr = new int[arr.length + 1];

                for (int i = 0, j = 0; i < newArr.length; i++) {
                    if (i == index) {
                        newArr[i] = x;
                    } else {
                        newArr[i] = arr[j++];
                    }
                }

                System.out.println("New array: ");
                for (int i = 0; i < newArr.length; i++) {
                    System.out.print(newArr[i] + " ");
                }
                break;
            }
        }
    }
}
