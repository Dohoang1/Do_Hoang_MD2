import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
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
                    handleAddNewContact(sc, contacts);
                    break;
                case 2:
                    handleEditContact(contacts, sc);
                    break;
                case 3:
                    handleDeleteContact(contacts, sc);
                    break;
                case 4:
                    showAllContacts(contacts);
                    break;
                case 5:
                    handleFindContactById(contacts, sc);
                    break;
                default:
                    System.out.println("Exiting Program. Thank You!");
            }
        } while (choice >= 1 && choice <= 5);
        sc.close();
    }

    private static void handleAddNewContact(Scanner sc, List<Contact> contacts) {
        System.out.println("Add New Contacts");
        System.out.println("Enter The Number Of Contacts To Add: ");
        int contactNumber = Integer.parseInt(sc.nextLine());
        addNewContacts(contacts, contactNumber, sc);
    }

    private static void showAllContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No Contacts Available");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private static Contact findExistingContact(List<Contact> contacts, String id) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(id)) {
                return contact;
            }
        }
        return null;
    }

    private static void addNewContacts(List<Contact> contacts, int number, Scanner sc) {
        for (int i = 0; i < number; i++) {
            System.out.println("Enter Details For Contact " + (i + 1) + ":");
            System.out.println("Enter ID: ");
            String id = sc.nextLine();
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Phone: ");
            String phone = sc.nextLine();
            System.out.println("Enter Email: ");
            String email = sc.nextLine();
            System.out.println("Enter Address: ");
            String address = sc.nextLine();
            contacts.add(new Contact(id, name, phone, email, address));
        }
        System.out.println(number + " Contacts added successfully.");
    }

    private static void handleEditContact(List<Contact> contacts, Scanner sc) {
        System.out.println("Edit Contact");
        System.out.println("Enter ID To Edit: ");
        String editingContactId = sc.nextLine();
        Contact contactToEdit = findExistingContact(contacts, editingContactId);
        if (contactToEdit != null) {
            editExistingContact(contactToEdit, sc);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    private static void handleDeleteContact(List<Contact> contacts, Scanner sc) {
        System.out.println("Delete Contact");
        System.out.println("Enter ID To Delete: ");
        String id = sc.nextLine();
        Contact contactToDelete = findExistingContact(contacts, id);
        if (contactToDelete != null) {
            removeExistingContact(contacts, contactToDelete);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    private static void handleFindContactById(List<Contact> contacts, Scanner sc) {
        System.out.println("Find Contact by ID");
        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        Contact contactToFind = findExistingContact(contacts, id);
        if (contactToFind != null) {
            System.out.println("Contact Found: " + contactToFind);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    private static void editExistingContact(Contact contactToEdit, Scanner sc) {
        int choice;
        do {
            System.out.println("Select The Category You Want To Edit: ");
            System.out.println("1. Edit ID");
            System.out.println("2. Edit Name");
            System.out.println("3. Edit Phone");
            System.out.println("4. Edit Email");
            System.out.println("5. Edit Address");
            System.out.println("6. Return To Main Menu");
            System.out.println("Enter Your Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter New ID");
                    contactToEdit.setId(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Enter New Name");
                    contactToEdit.setName(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Enter New Phone");
                    contactToEdit.setPhone(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Enter New Email");
                    contactToEdit.setEmail(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Enter New Address");
                    contactToEdit.setAddress(sc.nextLine());
                    break;
                case 6:
                    System.out.println("Returning to Main Menu.");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            if (choice >= 1 && choice <= 5) {
                System.out.println("Contact Updated Successfully");
            }
        } while (choice != 6);
    }

    private static void removeExistingContact(List<Contact> contacts, Contact contactToDelete) {
        contacts.remove(contactToDelete);
        System.out.println("Contact Deleted Successfully");
    }
}
