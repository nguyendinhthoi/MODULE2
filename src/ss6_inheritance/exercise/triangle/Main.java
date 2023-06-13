package ss6_inheritance.exercise.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1:");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 2");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 3");
        double side3 = Double.parseDouble(scanner.nextLine());

        System.out.println("The color of Triangle is ");
        String color = scanner.nextLine();
        System.out.println("Is filled? True or False");
        boolean isFilled = Boolean.parseBoolean(scanner.nextLine());

        Triangle triangle = new Triangle(color, isFilled, side1, side2, side3);
        System.out.println(triangle);
    }
}
