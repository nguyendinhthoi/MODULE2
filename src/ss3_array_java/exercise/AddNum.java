package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrNum = {2, 4, 6, 8, 10};
        int[] newArr = new int[arrNum.length + 1];

        System.out.println("Enter the number you want to add :");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter index you want to add");
        int index = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arrNum[i];
            } else if (i == index) {
                newArr[i] = num;
            } else {
                newArr[i] = arrNum[i - 1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
