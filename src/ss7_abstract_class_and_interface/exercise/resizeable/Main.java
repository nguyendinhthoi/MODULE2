package ss7_abstract_class_and_interface.exercise.resizeable;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(2, "red", true);
        shapes[1] = new Rectangle(3, 4, "blue", false);
        shapes[2] = new Square("yellow", true, 5);


        String name;
        do {
            System.out.println("Let enter name of shape ( Circle , Rectangle , Square ) \n*Exit* to out!!");
            name = scanner.nextLine();
            for (int i = 0; i < shapes.length; i++) {
                if (Objects.equals(name, "Circle")) {
                    System.out.println(shapes[0]);

                    System.out.println("Enter percent you want to resize");
                    float percent = Float.parseFloat(scanner.nextLine());

                    ((Circle) shapes[0]).resize(percent);
                    break;
                } else if (Objects.equals(name, "Rectangle")) {
                    System.out.println(shapes[1]);

                    System.out.println("Enter percent you want to resize");
                    float percent = Float.parseFloat(scanner.nextLine());

                    ((Rectangle) shapes[1]).resize(percent);
                    break;
                } else if (Objects.equals(name, "Square")) {
                    System.out.println(shapes[2]);

                    System.out.println("Enter percent you want to resize");
                    float percent = Float.parseFloat(scanner.nextLine());

                    ((Square) shapes[2]).resize(percent);
                    break;
                } else if (Objects.equals(name, "Exit")) {
                    System.out.println("Im out!!");
                    System.exit(0);
                }
            }
        } while (true);
    }
}

