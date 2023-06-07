package ss3_array_java.exercise;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let enter number of father array"); //bạn muốn số lượng phần tử cha là bao nhiêu?
        int lengthArr = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[lengthArr][];

        for (int i = 0; i < arr.length; i++) {  // truy xuất tới từng phần tử từng thằng cha, và tạo mảng mới cho nó
            System.out.println("Let enter number of child array " + (i + 1));
            int lengthArr1 = Integer.parseInt(scanner.nextLine());
            arr[i] = new int[lengthArr1];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Let enter value " + i + "-" + j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int indexI = 0;
        int indexJ = 0;
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.printf("The max number is %d at position arr[%d][%d]", max, indexI, indexJ);
    }
}
