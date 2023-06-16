package ss11_stack_queue.exercise.reverse_element;

import java.util.Stack;

public class Number {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack.push(12);
        stack.push(11);
        stack.push(10);
        stack.push(9);

        System.out.println(stack);
        stack1.push(stack.pop());
        stack1.push(stack.pop());
        stack1.push(stack.pop());
        stack1.push(stack.pop());
        System.out.println(stack1);
    }
}
