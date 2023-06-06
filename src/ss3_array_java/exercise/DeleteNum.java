package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteNum {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 7, 8, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to delete in array!!");
        int numDel = Integer.parseInt(scanner.nextLine());
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numDel) {
                numbers[i] = 0;
                index = i;
            }
        }
        for (int i = index + 1; i < numbers.length; i++) {
            numbers[i - 1] = numbers[i];
        }
        numbers[numbers.length - 1] = 0;

        System.out.println(Arrays.toString(numbers));
    }
}
