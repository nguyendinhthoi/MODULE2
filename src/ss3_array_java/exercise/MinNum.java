package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let enter number of the father array : ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Let enter number of the child array : ");
        int length1 = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[length][length1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Enter value arr[%d][%d]", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int indexI = 0;
        int indexJ = 0;
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("\n");
        System.out.printf("The min number is %d at position arr[%d][%d]", min, indexI, indexJ);
    }
}
