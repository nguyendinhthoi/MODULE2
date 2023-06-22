package ss15_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        do {
            try {
                flag = false;
                System.out.println("Enter sides1 of Triangle");
                int side1 = Integer.parseInt(scanner.nextLine());
                if (side1 < 0) {
                    throw new NegativeNumberException();
                }
                System.out.println("Enter sides2 of Triangle");
                int side2 = Integer.parseInt(scanner.nextLine());
                if (side2 < 0) {
                    throw new NegativeNumberException();
                }
                System.out.println("Enter sides3 of Triangle");
                int side3 = Integer.parseInt(scanner.nextLine());
                if (side3 < 0) {
                    throw new NegativeNumberException();
                }
                if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
                    throw new SumOfTwoSidesException();
                } else {
                    System.out.println("It's a Triangle");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter Number!!");
                flag = true;
            } catch (NegativeNumberException e) {
                System.out.println("Enter another number greater than 0!");
                flag = true;
            } catch (SumOfTwoSidesException e) {
                System.out.println("It's not a Triangle");
                flag = true;
            }

        } while (flag);
    }

}
