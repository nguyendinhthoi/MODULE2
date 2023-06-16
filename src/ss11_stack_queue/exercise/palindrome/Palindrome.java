package ss11_stack_queue.exercise.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        Stack<String> stack = new Stack<>();

        System.out.println("Enter the string you want to check ( example: able was i ere i saw elba)");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String[] strings = string.split("");
        boolean flag = true;

        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
            queue.add(strings[i]);
        }
        System.out.println(stack);
        System.out.println(queue);

        while (!stack.isEmpty()) {
            if (Objects.equals(stack.pop(), queue.remove())) {
            } else {
                System.out.println("false");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("true");
        }
        System.out.println(stack);
        System.out.println(queue);
    }
}
