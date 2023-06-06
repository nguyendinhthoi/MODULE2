package ss2_loop_java.exercise;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("Select number : " +
                    "\n1. Print the rectangle" +
                    "\n2. Print the square triangle" +
                    "\n3. Print isosceles triangle" +
                    "\n0. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Enter height : ");
                    int height = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter width : ");
                    int width = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("1.top-left, 2.top-right, 3.botton-left, 4.botton-right");
                    int choose1 = Integer.parseInt(scanner.nextLine());
                    switch (choose1) {
                        case 1:
                            System.out.println("Enter h : ");
                            int h = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i <= h; i++) {
                                for (int j = 0; j < i; j++) {
                                    if (j <= i) {
                                        System.out.print("*");
                                    }
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 2:
                            System.out.println("Enter h : ");
                            int h1 = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i <= h1; i++) {
                                for (int j = 0; j < h1; j++) {
                                    if (j + i >= h1) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 3:
                            System.out.println("Enter h : ");
                            int h2 = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i < h2; i++) {
                                for (int j = 0; j < h2; j++) {
                                    if (j + i <= h2 - 1) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 4:
                            System.out.println("Enter h : ");
                            int h3 = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i < h3; i++) {
                                for (int j = 0; j < h3; j++) {
                                    if (j >= i) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                                System.out.print("\n");
                            }
                    }
                    break;
                case 3:
                    System.out.println("Enter h : ");
                    int h4 = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < h4; i++) {
                        for (int j = 0; j <= h4 * 2; j++) {
                            if (j + i >= h4 && j - i <= h4) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.out.println("Closed");
                    System.exit(0);
                    flag = false;
                default:
                    System.out.println("No choice!");
            }
        } while (flag);
    }
}


