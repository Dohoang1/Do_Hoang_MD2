import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public class Node() {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, E element) {

    }
}
