package com.arsatapathy.hashes;

import java.util.Objects;

public class HashTableBasics<X, Y> {

    private HashEntry<X, Y>[] data;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTableBasics(int capacity) {
        this.capacity = capacity;
        this.data = new HashEntry[capacity];
        this.size = 0;
    }

    public void put(X key, Y value) {
        int hash = calculateHash(key);

        data[hash] = new HashEntry<>(key, value);
        size++;
    }

    public Y get(X key) {
        int hash = calculateHash(key);

        if (data[hash] == null)
            return null;
        else
            return data[hash].getValue();
    }

    public Y delete(X key) {
        Y value = get(key);

        if (value != null) {
            int hash = calculateHash(key);
            data[hash] = null;
            size--;
        }

        return value;
    }

    public boolean hasKey(X key) {
        return data[calculateHash(key)] != null;
    }

    public boolean hasValue(Y value) {
        for (HashEntry<X, Y> item:
             data) {
            if (item != null && item.getValue().equals(value)) return true;
        }

        return false;
    }

    public int size() {
        return size;
    }

    private int calculateHash(X key) {
        return Objects.hash(key) % capacity;
    }

    private class HashEntry<X, Y> {

        private X key;
        private Y value;

        public HashEntry(X key, Y value) {
            this.key = key;
            this.value = value;
        }

        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }
    }
}
