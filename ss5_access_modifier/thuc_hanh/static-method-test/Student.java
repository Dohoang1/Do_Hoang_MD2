public class Student {
    private int rollno; //instance var
    private String name; //instance var
    private static String college = "BBDIT"; //class var

    Student (int r, String n) { //constructor
        rollno = r;
        name = n;
    }

    static void change() { //static method
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
