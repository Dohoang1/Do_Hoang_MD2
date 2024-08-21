public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[size];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        } else {
            int n = elements.length + 1;
            Object[] temp = new Object[n];
            for (int i = 0; i < index; i++) {
                temp[i] = elements[i];
            }
            temp[index] = element;
            for (int i = index ; i < elements.length; i++) {
                temp[i + 1] = elements[i];
            }
            elements = temp;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        } else {
            int n = elements.length - 1;
            Object[] temp = new Object[n];
            for (int i = 0; i < index; i++) {
                temp[i] = elements[i];
            }
            for (int i = index; i < elements.length - 1; i++) {
                temp[i] = elements[i + 1];
            }
            elements = temp;
        }
        return (E) elements;
    }

    public int size() {
        return elements.length;
    }

    public Object clone(Object[] newArray) {
        newArray = elements;
        return newArray;
    }

    public boolean contains(E element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        ;
        return false;
    }

    public int indexOf (E element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1 ;
    }

    public boolean add(E element) {
        Object[] temp = new Object[elements.length + 1];
        temp[temp.length-1] = element;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            elements = new Object[minCapacity];
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[size];
    }

    public void printList() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

}
