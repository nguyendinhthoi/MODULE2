package ss14_sort;

import java.util.Arrays;

public class ShowInsertionSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 4, 6, 1};
        insertionSort(array);
    }

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            System.out.printf("Phần tử %d :",x);
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                System.out.println(Arrays.toString(list));
                pos--;
            }
            list[pos] = x;
        }
    }
}
