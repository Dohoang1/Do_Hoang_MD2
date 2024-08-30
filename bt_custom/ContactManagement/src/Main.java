import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContactManagement contactManagement = new ContactManagement();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(contactManagement, sc);

        menu.displayMenu();

        sc.close();
    }
}