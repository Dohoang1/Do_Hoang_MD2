public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue1 = new MyQueue(4);
        queue1.enqueue(1);
        queue1.dequeue();
        queue1.enqueue(56);
        queue1.enqueue(2);
        queue1.enqueue(67);
        queue1.dequeue();
        queue1.dequeue();
        queue1.enqueue(24);
        queue1.dequeue();
        queue1.enqueue(98);
        queue1.enqueue(45);
        queue1.enqueue(23);
        queue1.enqueue(435);

        queue1.printQueue();
    }
}
