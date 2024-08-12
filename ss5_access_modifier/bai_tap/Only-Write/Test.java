public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", "c04");
        Student s2 = new Student();

        s2.setName("Kim");
        s2.setClasses("c04");

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
