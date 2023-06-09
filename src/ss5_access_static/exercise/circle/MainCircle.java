package ss5_access_static.exercise.circle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius you want");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the color you want");
        String color = scanner.nextLine();

        Circle circle = new Circle();

        circle.setRadius(radius);
        circle.setColor(color);

        circle.display();
    }
}
