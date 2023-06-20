package ss13_searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = Integer.parseInt(scanner.nextLine());

        int[] ints = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter ints[%d] :", i);
            ints[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Before sort");
        System.out.println(Arrays.toString(ints));
        System.out.println("After sort");
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        System.out.print("Enter value you want to find index :");
        int value = Integer.parseInt(scanner.nextLine());
        int right = ints.length - 1;

        System.out.printf("Index of %d is : " + binarySearch(ints, 0, right, value), value);
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left < right) {
            if (value < array[middle]) {
                right = middle - 1;
                return binarySearch(array, left, right, value);
            } else if (value == array[middle]) {
                return middle;
            } else {
                left = middle + 1;
                return binarySearch(array, left, right, value);
            }
        }
        return -1;
    }
}

