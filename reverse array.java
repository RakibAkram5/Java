import java.util.*;

class Stack {
    int size;
    int top;
    int[] a;

    // Constructor to initialize the stack.
    Stack(int n) {
        top = -1;
        size = n;
        a = new int[size];
    }

    // Check if the stack is empty.
    boolean isEmpty() {
        return (top < 0);
    }

    // Push method to add an element to the stack.
    boolean push(int x) {
        // Change condition: since indices go from 0 to size-1, check if top == size - 1.
        if (top >= size - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    // Pop method to remove and return the top element.
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            // Return the current top element then decrement the top pointer.
            return a[top--];
        }
    }
}

class Main {
    public static void reverse(int arr[], int n) {
        // Correct capitalization when creating a new Stack instance.
        Stack obj = new Stack(n);
        // Push all elements of the array onto the stack.
        for (int i = 0; i < n; i++) {
            obj.push(arr[i]);
        }
        // Pop elements from the stack to reverse the array.
        for (int i = 0; i < n; i++) {
            arr[i] = obj.pop();
        }
        // Print the reversed array.
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int n = 4;
        int[] a = new int[]{100, 200, 300, 400};
        reverse(a, n);
    }
}
