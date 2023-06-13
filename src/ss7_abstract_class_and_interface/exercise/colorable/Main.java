package ss7_abstract_class_and_interface.exercise.colorable;

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
                    break;
                } else if (Objects.equals(name, "Rectangle")) {
                    System.out.println(shapes[1]);
                    break;
                } else if (Objects.equals(name, "Square")) {
                    shapes[2].howToClor();
                    break;
                } else if (Objects.equals(name, "Exit")) {
                    System.out.println("Im out");
                    System.exit(0);
                }
            }
        } while (true);
    }
}


