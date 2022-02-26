package com.arsatapathy.stacks;

import java.util.ArrayList;
import java.util.List;

public class StackBasics<T> {

    private List<T> values;

    public StackBasics() {
        this.values = new ArrayList<>();
    }

    public void push(T value) {
        values.add(value);
    }

    public T pop() {

        if (values.size() == 0) return null;

        return values.remove(values.size() - 1);
    }

    public boolean contains(T item) {

        for (T value : values) {
            if (item == value) {
                return true;
            }
        }

        return false;

    }

    public int getSize() {
        return values.size();
    }
}