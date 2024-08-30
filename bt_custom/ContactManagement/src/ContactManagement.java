import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManagement {
    private List<Contact> contacts;

    public ContactManagement() {
        this.contacts = new ArrayList<>();
    }

    public void handleAddNewContact(Scanner sc) {
        System.out.println("Add New Contacts");
        System.out.println("Enter The Number Of Contacts To Add: ");
        int contactNumber = Integer.parseInt(sc.nextLine());
        addNewContacts(contactNumber, sc);
    }

    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No Contacts Available");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private Contact findExistingContact(String id) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(id)) {
                return contact;
            }
        }
        return null;
    }

    private void addNewContacts(int number, Scanner sc) {
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

    public void handleEditContact(Scanner sc) {
        System.out.println("Edit Contact");
        System.out.println("Enter ID To Edit: ");
        String editingContactId = sc.nextLine();
        Contact contactToEdit = findExistingContact(editingContactId);
        if (contactToEdit != null) {
            editExistingContact(contactToEdit, sc);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    public void handleDeleteContact(Scanner sc) {
        System.out.println("Delete Contact");
        System.out.println("Enter ID To Delete: ");
        String id = sc.nextLine();
        Contact contactToDelete = findExistingContact(id);
        if (contactToDelete != null) {
            removeExistingContact(contactToDelete);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    public void handleFindContactById(Scanner sc) {
        System.out.println("Find Contact by ID");
        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        Contact contactToFind = findExistingContact(id);
        if (contactToFind != null) {
            System.out.println("Contact Found: " + contactToFind);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    private void editExistingContact(Contact contactToEdit, Scanner sc) {
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

    private void removeExistingContact(Contact contactToDelete) {
        contacts.remove(contactToDelete);
        System.out.println("Contact " + contactToDelete.getName() + " Deleted Successfully");
    }
}