import java.util.Scanner;

public class FindMaxInMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of row for the Matrix: ");
        int row = sc.nextInt();

        System.out.println("Enter number of column for the Matrix: ");
        int column = sc.nextInt();

        int[][] matrixArr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the element for arr " + (i + 1) + ", index " + j + " : ");
                int ele = sc.nextInt();
                matrixArr[i][j] = ele;
            }
        }

        System.out.println("The Matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrixArr[i][j] + " ");
            }
            System.out.println();
        }


        int max = matrixArr[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrixArr[i][j] > max) {
                    max = matrixArr[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        System.out.println("The Max element is: " + max + " at row " + maxRow + " collum " + maxCol);
    }
}
