class Stack {
    int size;
    int top;
    char[] a;

    // Constructor to initialize the stack.
    Stack(int n) {
        top = -1;
        size = n;
        a = new char[size];
    }

    // Method to check if the stack is empty.
    boolean isEmpty() {
        return (top < 0);
    }

    // Push method to add an element to the stack.
    boolean push(char x) {
        // Check if the stack is full.
        if (top >= size - 1) {
            System.out.println("Stack Overflow.");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    // Pop method to remove and return the top element from the stack.
    char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow.");
            return '\0';  // Return the null character if the stack is empty.
        } else {
            return a[top--];
        }
    }
    
    // Optional: A method to display the stack contents.
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
    
    // Main method to test the Stack implementation.
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push('A');
        s.push('B');
        s.push('C');
        s.display();
        System.out.println("Popped element: " + s.pop());
        s.display();
    }
}
