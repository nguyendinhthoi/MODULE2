package ss2_loop_java.practice;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let enter a : ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Let enter b : ");
        int b = Integer.parseInt(scanner.nextLine());

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor :  " +a);
    }
}
