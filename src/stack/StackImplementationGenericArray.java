package stack;

public class StackImplementationGenericArray<T> {

    private final T[] array;
    private int top;

    @SuppressWarnings("unchecked")
    public StackImplementationGenericArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        // Java doesn't allow direct creation of arrays of a generic type.
        this.array = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        array[++top] = value;
    }

    public T pop() {
        ensureNotEmpty();
        T value = array[top];
        array[top--] = null; // Release the reference so the object can be garbage-collected.
        return value;
    }

    public T peek() {
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

    public static void main(String[] args) {
        StackImplementationGenericArray<Integer> stack = new StackImplementationGenericArray<>(10);
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
