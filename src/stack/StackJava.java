package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackJava {

    static void main(String[] args) {

        // Stack is the older, synchronized stack class.
        Stack<Integer> stack = new Stack<>();

        // Deque with ArrayDeque is generally preferred for new stack code.
        Deque<Integer> deque = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        deque.push(10);
        deque.push(20);
        deque.push(30);
        deque.push(40);
        deque.push(50);
        printBottomToTop(deque);
        deque.pop();
        printBottomToTop(deque);
    }

    private static void printBottomToTop(Deque<Integer> deque) {
        StringBuilder output = new StringBuilder("[");
        for (var iterator = deque.descendingIterator(); iterator.hasNext(); ) {
            if (output.length() > 1) {
                output.append(", ");
            }
            output.append(iterator.next());
        }
        System.out.println(output.append(']'));
    }
}
