import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer [] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
        try {
            System.out.println("\nVui long nhap chi so cua mot phan tu bat ky: ");
            int x = scaner.nextInt();
            System.out.println("Gia tri cua phan tu co chi so " + x + "la " + arr[x]);
            continueLoop = false;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chi so vuot qua gioi han cua mang");
            scaner.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Dau vao khong hop le, vui long nhap 1 so nguyen duong");
            scaner.nextLine();
        }
    }
}
}