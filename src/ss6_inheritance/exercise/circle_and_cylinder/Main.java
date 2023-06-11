package ss6_inheritance.exercise.circle_and_cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of Circle");
        double radiusCircle = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color of Circle");
        String colorCircle = scanner.nextLine();

        System.out.println("Enter radius of Cylinder");
        double radiusCylinder = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter height of Cylinder");
        double heightCylinder = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color of Cylinder");
        String colorCylinder = scanner.nextLine();

        Circle circle = new Circle(radiusCircle, colorCircle);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(radiusCylinder, colorCylinder, heightCylinder);
        System.out.println(cylinder);

    }
}
