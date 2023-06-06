package ss2_loop_java.exercise;

import java.util.Scanner;

public class PrimeCheck100 {
    public static void main(String[] args) {
        int numberCheck = 2;

        do {
            int count = 0;
            for (int i = 1; i <= numberCheck; i++) {
                if (numberCheck % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(numberCheck + "\n");
            }
            numberCheck++;
        } while (numberCheck <= 100);
    }
}
