import java.util.Scanner;

public class Menu {
    private ContactManagement contactManagement;
    private Scanner sc;

    public Menu(ContactManagement contactManagement, Scanner sc) {
        this.contactManagement = contactManagement;
        this.sc = sc;
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("---------MENU---------");
            System.out.println("1. Add New Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Find Contact by ID");
            System.out.println("=> Please select function [1->5] or press other numbers to exit the program:");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    contactManagement.handleAddNewContact(sc);
                    break;
                case 2:
                    contactManagement.handleEditContact(sc);
                    break;
                case 3:
                    contactManagement.handleDeleteContact(sc);
                    break;
                case 4:
                    contactManagement.showAllContacts();
                    break;
                case 5:
                    contactManagement.handleFindContactById(sc);
                    break;
                default:
                    System.out.println("Exiting Program. Thank You!");
            }
        } while (choice >= 1 && choice <= 5);
    }
}