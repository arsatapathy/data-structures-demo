package com.arsatapathy.queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueBasicsTest {

    QueueBasics<Integer> queueBasics = new QueueBasics<>();

    public void init() {
       queueBasics.enqueue(1);
       queueBasics.enqueue(2);
       queueBasics.enqueue(3);
       queueBasics.enqueue(4);
       queueBasics.enqueue(5);
    }

    @Test
    public void testQueue() {
        init();

        Assertions.assertEquals(5, queueBasics.size());

        Assertions.assertTrue(queueBasics.contains(5));

        Assertions.assertEquals(1, (int) queueBasics.dequeue());
        Assertions.assertEquals(2, (int) queueBasics.dequeue());
        Assertions.assertEquals(3, (int) queueBasics.dequeue());
        Assertions.assertEquals(4, (int) queueBasics.dequeue());
        Assertions.assertEquals(5, (int) queueBasics.dequeue());

        Assertions.assertEquals(0, queueBasics.size());

        Assertions.assertNull(queueBasics.dequeue());

        Assertions.assertFalse(queueBasics.contains(5));
    }
}
