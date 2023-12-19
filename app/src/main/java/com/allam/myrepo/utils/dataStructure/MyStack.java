package com.allam.myrepo.utils.dataStructure;

import android.util.Log;

public class MyStack {
    /**
     * implement stack using Array (Fixed size)
     * <p>
     * Functions:
     * isEmpty
     * push
     * pop
     */
    private static final String TAG = "MyStack";
    private final int stackSize;
    private final int[] arr;
    private int top = -1; //-1 means that top out of array boundaries

    public MyStack(int stackSize) {
        this.stackSize = stackSize;
        this.arr = new int[stackSize];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean push(int input) {
        if (top < stackSize - 1) {
            arr[++top] = input;
            Log.d(TAG, "push:Success");
            return true;
        } else {
            Log.d(TAG, "push: Stack OverFlow");
            return false;
        }
    }

    public int pop() {
        if (isEmpty()) {
            Log.d(TAG, "pop: Stack UnderFlow");
            return 0;
        } else if (top >= 0) {
            int result = arr[top];
            top--;
            Log.d(TAG, "pop:value " + result);
            return result;

        } else {
            Log.d(TAG, "pop: Stack UnderFlow");
            return 0;
        }
    }

    public void print() {
        for (int i = 0; i < stackSize; i++) {
            Log.d(TAG, "print: index= " + i + " value= " + arr[i]);
        }
    }
}
