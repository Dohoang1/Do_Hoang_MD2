import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size < 0 || size > 20) {
                System.out.println("Size must be between 0 and 20");
            }
        } while (size < 0 || size > 20);

array = new int[size];
int i = 0;
while (i < array.length) {
    System.out.print("Enter element " + (i+1) + ": ");
    array[i] = sc.nextInt();
    i++;
}
        System.out.print("Property list: ");
for ( int j = 0; j < array.length; j++ ) {
    System.out.print(array[j] + "\t");
}

int max = array[0];
int index = 0;
for (int j = 1; j < array.length; j++) {
    if (array[j] > max) {
        max = array[j];
        index = j;
    }
}
        System.out.println("The largest value in the list is " + max + " at index " + index);
    }
}
