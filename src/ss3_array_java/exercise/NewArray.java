package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8};
        int[] arr1 = {1, 3, 5, 7};
        int[] newArr = new int[arr.length + arr1.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            newArr[arr.length + i] = arr1[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
