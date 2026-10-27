package stack;

import java.util.ArrayList;

public class StackImplementationGenericArrayList<T> {

    private final ArrayList<T> stackList;

    public StackImplementationGenericArrayList() {
        stackList = new ArrayList<>();
    }

    public void push(T item) {
        stackList.add(item);
    }
    public T pop() {
        return stackList.remove(stackList.size() - 1);
    }
    public T peek() {
        return stackList.get(stackList.size() - 1);
    }
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
    public boolean isFull() {
        return stackList.size() >= stackList.size();
    }
    public int size() {
        return stackList.size();
    }
    static void main() {
        StackImplementationGenericArrayList stack = new StackImplementationGenericArrayList();
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
