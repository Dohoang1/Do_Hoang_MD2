import java.util.Scanner;

public class RemoveEle {
    public static void main(String[] args) {
        int[] arr = {33, 42, 15, 61, 6, 12, 8, 54, 12, 98, 3, 17};
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the element to be removed:");
            int x = sc.nextInt();
            int index_del = -1;

            for (int i = 0; i < arr.length; i++) {
                if (x == arr[i]) {
                    index_del = i;
                    break;
                }
            }

            if (index_del == -1) {
                System.out.println(x + " not found. Try again.");
            } else {
                System.out.println(x + " found at index " + index_del + ", and will be removed");

                for (int i = index_del; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }

                int[] newArr = new int[arr.length - 1];
                for (int i = 0; i < newArr.length; i++) {
                    newArr[i] = arr[i];
                }

                System.out.print("New array: ");
                for (int i = 0; i < newArr.length; i++) {
                    System.out.print(newArr[i] + " ");
                }
                break;
            }
        }
    }
}