package com.arsatapathy.older.arrays;

public class ArrayOperation<T> {
    
    private T[] array;
    private final int LENGTH; 
    
    public ArrayOperation(T[] array) {
        this.array = array;
        LENGTH = array.length; 
    }

    // insert at end
    public ArrayOperation<T> insert(T value) {

        array[LENGTH - 1] = value;

        return this;
    }

    // delete from last
    public ArrayOperation<T> delete() {

        array[LENGTH - 1] = null;

        return this;
    }

    public ArrayOperation<T> insert(T value, int index) {

        for (int i = index; i < LENGTH - 1; i++) {
            array[i+1] = array[i];
        }

        array[index] = value;

        return this;
    }

    public ArrayOperation<T> delete(int index) {

        for (int i = index; i < LENGTH - 1; i++) {
            array[i] = array[i+1];
        }
        
        this.array[LENGTH - 1] = null;
        
        return this;
    }

    public void print() {

        for (T element :
                this.array) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    public ArrayOperation<T> reverse() {

        T temp;

        for (int i = 0; i < LENGTH/2; i++) {
            temp = this.array[i];
            this.array[i] = this.array[LENGTH -1 -i];
            this.array[LENGTH -1 -i] = temp;
        }

        return this;
    }

    public int length() {
        return LENGTH;
    }

    public T[] getArray() {
        return array;
    }
}
