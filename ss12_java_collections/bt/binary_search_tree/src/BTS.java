import javax.swing.tree.TreeNode;

public class BTS<E extends Comparable<E>> extends AbstractTree {
    protected TreeNode<E> root;
    protected int size = 0;

    public BTS() {}

    public BTS(E[] object) {
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
    }

    @Override
    public boolean insert(E element) {
        if (root == null) {
            root = creatNewNode(element);
        }
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (element.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                }
            }
        }
    }
}
