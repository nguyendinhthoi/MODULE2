package ss2_loop_java.exercise;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many prime number do you want?");
        int number = Integer.parseInt(scanner.nextLine());
        int numberCheck = 1;
        int countPrime = 0;

        do {
            int count = 0;
            for (int i = 1; i <= numberCheck; i++) {
                if (numberCheck % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(numberCheck + "\n");
                countPrime++;
            }
            numberCheck++;
        } while (countPrime < number);
    }
}

