package ss3_array_java.exercise;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String array = "Welcome to my homework";
        System.out.println("Enter a character you want to find:");
        char character = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < array.length(); i++) {
            if (character == array.charAt(i)){
                count++;
            }
        }
        System.out.printf("There are %d character %s in the string",count,character);
    }
}
