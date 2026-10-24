package stack;

import java.util.ArrayList;

public class StackImplementationArrayList {

    private final ArrayList<Integer> stackList;


    public StackImplementationArrayList() {
        stackList = new ArrayList<>();
    }

    public void push(int value) {
        stackList.add(value);
    }

    public int pop() {
        ensureNotEmpty();
        return stackList.remove(stackList.size() - 1);
    }

    public int peek() {
        ensureNotEmpty();
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int size() {
        return stackList.size();
    }

    private void ensureNotEmpty() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
    }

    static void main() {
        StackImplementationArrayList stack = new StackImplementationArrayList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.stackList);
        stack.pop();
        System.out.println(stack.stackList);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
