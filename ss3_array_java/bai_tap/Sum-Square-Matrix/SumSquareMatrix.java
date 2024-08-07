import java.util.Scanner;

public class SumSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrixArr;

        System.out.println("Enter the side length of the square matrix: ");
        int size = sc.nextInt();

        matrixArr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter the value for arr " + i + " index " + j + ": ");
                matrixArr[i][j] = sc.nextInt();
            }
        }

        System.out.print("The square matrix is: \n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrixArr[i][j] + " ");
            }
            System.out.println();
        }

        while (true) {
            System.out.println("Enter the number of the row + column you want to sum: ");
            int sumLine = sc.nextInt();
            if (sumLine > size || sumLine < 1) {
                System.out.println("Invalid number");
            } else {
                int sum = 0;

                for (int i = 0; i < size; i++) {
                    sum += matrixArr[sumLine - 1][i];
                }
                for (int i = 0; i < size; i++) {
                    sum += matrixArr[i][sumLine - 1];
                }
                sum -= matrixArr[sumLine - 1][sumLine - 1];

                System.out.println("The sum of row " + sumLine + ", column " + sumLine + " is: " + sum);
                break;
            }
        }
    }
}