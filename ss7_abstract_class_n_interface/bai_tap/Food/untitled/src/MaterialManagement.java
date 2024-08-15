import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaterialManagement {
    public static void main(String[] args) {

        ArrayList<Material> materialsList = new ArrayList<>();

        materialsList.add(new CrispyFlour("fl001", "White Flour", LocalDate.of(2024, 8, 15), 20000, 15));
        materialsList.add(new CrispyFlour("fl002", "Yellow Flour", LocalDate.of(2024, 8, 15), 15000, 20));
        materialsList.add(new CrispyFlour("fl003", "Green Flour", LocalDate.of(2024, 8, 15), 25000, 10));
        materialsList.add(new CrispyFlour("fl004", "Gray Flour", LocalDate.of(2024, 8, 15), 10000, 25));
        materialsList.add(new CrispyFlour("fl005", "Gold Flour", LocalDate.of(2024, 8, 15), 50000, 5));
        materialsList.add(new Meat("me001", "Beef", LocalDate.of(2024, 8, 15), 200000, 20));
        materialsList.add(new Meat("me002", "Chicken", LocalDate.of(2024, 8, 15), 120000, 35));
        materialsList.add(new Meat("me003", "Goat", LocalDate.of(2024, 8, 15), 250000, 15));
        materialsList.add(new Meat("me004", "Boar", LocalDate.of(2024, 8, 15), 150000, 25));
        materialsList.add(new Meat("me005", "Pork", LocalDate.of(2024, 8, 15), 80000, 45));


        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\t -- MENU --");
            System.out.println("1. Display Materials List.");
            System.out.println("2. Add New Material.");
            System.out.println("3. Edit Material.");
            System.out.println("4. Delete Material.");
            System.out.println("0. Exit Application.");
            System.out.println("--------------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayList(materialsList);
                    break;
                case 2:
                    if (addNewMaterial(scanner, materialsList)) return;
                    break;
                    case 3:
                        editMaterial(scanner, materialsList);
                        break;
                case 4:
                    deleteMaterial(scanner, materialsList);
                    break;
                case 0:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
        }

    private static void deleteMaterial(Scanner scanner, ArrayList<Material> materialsList) {
        System.out.print("Enter Material ID to delete: ");
        scanner.nextLine();
        String findId = scanner.nextLine();
        boolean isFound = false;

        for (int i = 0; i < materialsList.size(); i++) {
            if (materialsList.get(i).getId().equals(findId)) {
                materialsList.remove(i);
                isFound = true;
                System.out.println("Material deleted successfully!");
                break;
            }
        }
        if (!isFound) {
            System.out.println("Material not found!");
        }
    }

    private static void editMaterial(Scanner scanner, ArrayList<Material> materialsList) {
        System.out.print("Enter Material ID to edit: ");
        scanner.nextLine();
        String id = scanner.nextLine();
        boolean found = false;

        for (Material material : materialsList) {
            if (material.getId().equals(id)) {
                found = true;
                System.out.print("Enter new Name: ");
                material.setName(scanner.nextLine());
                System.out.print("Enter new Manufacturing Date (yyyy-mm-dd): ");
                material.setManufacturingDate(LocalDate.parse(scanner.nextLine()));
                System.out.print("Enter new Cost: ");
                material.setCost(scanner.nextDouble());

                if (material instanceof CrispyFlour) {
                    System.out.print("Enter new Quantity: ");
                    ((CrispyFlour) material).setQuantity(scanner.nextInt());
                } else if (material instanceof Meat) {
                    System.out.print("Enter new Weight: ");
                    ((Meat) material).setWeigth(scanner.nextInt());
                }

                System.out.println("Material updated successfully!");
                break;
            }
}
        if (!found) {
            System.out.println("Material not found!");
        }
    }

    private static boolean addNewMaterial(Scanner scanner, ArrayList<Material> materialsList) {
        System.out.println("1. Add New Crispy Flour");
        System.out.println("2. Add New Meat");
        System.out.println("0. Return");
        System.out.print("Enter your choice: ");
        int choiceForAdd = scanner.nextInt();

        switch (choiceForAdd) {
            case 1:
                scanner.nextLine();
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Manufacturing Date (yyyy-mm-dd): ");
                LocalDate manufacturingDate = LocalDate.parse(scanner.nextLine());
                System.out.print("Enter Cost: ");
                double cost = scanner.nextDouble();
                System.out.print("Enter Quantity: ");
                int quantity = scanner.nextInt();

                materialsList.add(new CrispyFlour(id, name, manufacturingDate,(int) cost, quantity));
                System.out.println("New Crispy Flour added successfully!");
                break;
            case 2:
                scanner.nextLine();
                System.out.print("Enter ID: ");
                id = scanner.nextLine();
                System.out.print("Enter Name: ");
                name = scanner.nextLine();
                System.out.print("Enter Manufacturing Date (yyyy-mm-dd): ");
                manufacturingDate = LocalDate.parse(scanner.nextLine());
                System.out.print("Enter Cost: ");
                cost = scanner.nextDouble();
                System.out.print("Enter Weight: ");
                int weight = scanner.nextInt();

                materialsList.add(new Meat(id, name, manufacturingDate,(int) cost, weight));
                System.out.println("New Meat added successfully!");
                break;
            case 0:
                return true;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
        return false;
    }

    private static void displayList(ArrayList<Material> materialsList) {
        Collections.sort(materialsList);
        for (Material material : materialsList) {
            System.out.println(material);
        }
    }
}
