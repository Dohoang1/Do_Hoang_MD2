import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        String inputName = sc.nextLine();

        boolean foundStudent = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                foundStudent = true;
                System.out.println("Student name " + inputName + " found at index " + i);
                break;
            }
        }
        if (!foundStudent) {
            System.out.println("Not found " + inputName +" in the list");
        }
    }
}
