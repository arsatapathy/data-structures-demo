package com.arsatapathy.queues;

import java.util.ArrayList;
import java.util.List;

public class QueueBasics<T> {

    private List<T> values;

    public QueueBasics() {
        this.values = new ArrayList<>();
    }

    public int size() {
        return values.size();
    }

    public void enqueue(T item) {
        values.add(item);
    }

    public T dequeue() {
        if (values.size() == 0) return null;

        return values.remove(0);
    }

    public boolean contains(T item) {
        for (T value:
             values) {
            if (item == value) return true;
        }

        return false;
    }
}
