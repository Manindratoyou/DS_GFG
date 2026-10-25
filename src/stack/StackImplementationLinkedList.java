package stack;

public class StackImplementationLinkedList {

    private static class Node {
        private final int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        ensureNotEmpty();
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int peek() {
        ensureNotEmpty();
        return head.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder values = new StringBuilder("[");
        for (Node current = head; current != null; current = current.next) {
            if (values.length() > 1) {
                values.append(", ");
            }
            values.append(current.data);
        }
        return values.append(']').toString();
    }

    private void ensureNotEmpty() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
    }

    static void main() {
        StackImplementationLinkedList stack = new StackImplementationLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
