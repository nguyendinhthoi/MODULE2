package ss4_oop_java.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the height");
        double height = Double.parseDouble(scanner.nextLine());

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle is " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle is " + rectangle.getArea());
    }
}
