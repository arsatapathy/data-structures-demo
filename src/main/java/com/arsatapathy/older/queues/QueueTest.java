package com.arsatapathy.older.queues;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);

        queue.print();

        queue.dequeue();queue.print();
        queue.dequeue();queue.print();
        queue.dequeue();queue.print();
        queue.dequeue();queue.print();
        queue.dequeue();queue.print();
        queue.dequeue();queue.print();
        queue.dequeue();queue.print();
        queue.dequeue();queue.print();
        queue.dequeue();queue.print();

    }
}
