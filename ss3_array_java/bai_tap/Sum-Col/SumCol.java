import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row for the Matrix: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of column for the Matrix: ");
        int col = sc.nextInt();

        int[][] matrixArr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value for arr " + i + " index " + j + ": ");
                matrixArr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrixArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Which collum do you want to cal");
        int sumCollum = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += matrixArr[i][sumCollum - 1];
        }
        System.out.println("The sum of collums " + sumCollum + " is: " + sum);
    }
}
