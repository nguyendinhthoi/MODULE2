package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of the father array :");
        int length = Integer.parseInt(scanner.nextLine());

        double[][] arr = new double[length][];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter length of the child array %d ", i);
            int length1 = Integer.parseInt(scanner.nextLine());
            arr[i] = new double[length1];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Enter value of child array arr[%d][%d] ", i, j);
                arr[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("\n The position of the father array you want to sum is :  ");
        int choose = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][choose];
            }
        System.out.printf("Sum of arr[i][%d] is %f", choose, sum);
    }
}
