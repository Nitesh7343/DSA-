package KK.StackQueue;

import java.util.Arrays;

public class CustomStack {
    int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack() {
        this.data = new int [DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    int ptr = -1;

    public boolean push(int n) {
        if(isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = n;
        return true;
    }

    private boolean isFull() {
        return ptr == data.length-1;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Can not peek from a Empty Stack.");
        }
        return data[ptr];
    }

    public int pop() throws Exception{
        if(isEmpty()) {
            throw new Exception("Can not pop from an Empty Stack");
        }

        return data[ptr--];
    }


    private boolean isEmpty() {
        if (ptr == -1) return true;

        return false;
    }

    @Override
    public String toString() {
        return "data= " + Arrays.toString(data)
                ;
    }
}
