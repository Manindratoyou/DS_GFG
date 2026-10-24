package stack;

public class StackImplementationArray {

    private final int[] array;
    private int top;

    public StackImplementationArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        this.array = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        array[++top] = value;
    }

    public int pop() {
        ensureNotEmpty();
        return array[top--];
    }

    public int peek() {
        ensureNotEmpty();
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }

    public int size() {
        return top + 1;
    }

    private void ensureNotEmpty() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
    }

    static void main() {
        StackImplementationArray stack = new StackImplementationArray(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
