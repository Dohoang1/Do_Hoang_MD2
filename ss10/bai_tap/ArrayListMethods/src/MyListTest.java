public class MyListTest {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(0,"1");
        list.add(1,"2");
        list.add(2,"3");
        list.add(3,"4");
        list.add(4,"5");
        list.add(5,"6");

        System.out.println(list.get(3));
        list.printList();

        list.remove(1);
        list.printList();

        list.add(1,"?");
        list.printList();

        System.out.println(list.size());
    }
}
