package ss11_stack_queue.exercise.reverse_element;

import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String string = "abcdef";

        String[] strings = string.split("");
        Stack<Object> stack = new Stack<>();
        Stack<Object> stack1 = new Stack<>();

        for (String s : strings) {
            stack.push(s);
        }
        System.out.println(stack);
        for (int i = 0; i < strings.length; i++) {
            stack1.push(stack.pop());
        }
        System.out.println(stack1);
    }
}