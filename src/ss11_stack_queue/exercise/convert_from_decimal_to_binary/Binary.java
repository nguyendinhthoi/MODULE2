package ss11_stack_queue.exercise.convert_from_decimal_to_binary;


import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int a = Integer.parseInt(scanner.nextLine());
        int c;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();

        int b = a;
        while (b != 0) {
            c = a % 2;
            b = a / 2;
            a = b;
            stack.push(c);
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        System.out.println(stack1);
    }
}
