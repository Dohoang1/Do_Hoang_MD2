public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(27);
        tree.insert(12);
        tree.insert(10);
        tree.insert(8);
        tree.insert(9);
        tree.insert(5);
        tree.insert(7);
        tree.insert(4);

        System.out.println("Post-oder of the BST: ");
        tree.postOrder();
    }
}