package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of the father array");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter length of the child array");
        int length1 = Integer.parseInt(scanner.nextLine());

        double[][] arr = new double[length][length1];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Enter value of arr[%d][%d]", i, j);
                arr[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        double sum = 0.0d;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.printf("\nSum of main diagonal is %f",sum);
    }
}
