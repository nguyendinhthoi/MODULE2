package ss2_loop_java.practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let enter any number!!");
        int number = Integer.parseInt(scanner.nextLine());
        int countPrime = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                countPrime++;
            }
        }
        if (countPrime == 2) {
            System.out.printf("%d is a Prime Number!", number);
        } else {
            System.out.printf("%d is not a Prime Number!", number);
        }
    }
}
