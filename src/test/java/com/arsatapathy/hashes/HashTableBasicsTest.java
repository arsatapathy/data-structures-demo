package com.arsatapathy.hashes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTableBasicsTest {

    HashTableBasics<Integer, String> hashTableBasics = new HashTableBasics<>(5);

    public void init() {
        hashTableBasics.put(1, "ashish");
        hashTableBasics.put(2, "ranjan");
        hashTableBasics.put(3, "satapathy");
        hashTableBasics.delete(1);
        hashTableBasics.put(4, "ashish");
    }

    @Test
    public void testHashTableBasics() {
        init();

        Assertions.assertEquals(hashTableBasics.size(), 3);
        Assertions.assertEquals(hashTableBasics.get(2), "ranjan");
        Assertions.assertTrue(hashTableBasics.hasKey(3));
        Assertions.assertTrue(hashTableBasics.hasValue("satapathy"));
        Assertions.assertTrue(hashTableBasics.hasKey(4));

    }
}
