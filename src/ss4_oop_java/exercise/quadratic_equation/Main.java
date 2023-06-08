package ss4_oop_java.exercise.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c");
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.QuadraticEquation();
        System.out.println("delta = " + delta);
        if (delta > 0) {
            System.out.println("n1 = " + quadraticEquation.getRoot1() + "\nn2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("n1 = n2 = " + quadraticEquation.getRootDouble());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
