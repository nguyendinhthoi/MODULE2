package ss6_inheritance.exercise.point2d_and_point3d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2D x : ");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter 2D y : ");
        float y = Float.parseFloat(scanner.nextLine());

        PointTwoD pointTwoD = new PointTwoD(x, y);
        System.out.println(pointTwoD);

        System.out.println("Enter 3D x : ");
        float x1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter 3D y : ");
        float y1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter 3D z : ");
        float z = Float.parseFloat(scanner.nextLine());

        PointThreeD pointThreeD = new PointThreeD(x1, y1, z);
        System.out.println(pointThreeD);
    }
}
