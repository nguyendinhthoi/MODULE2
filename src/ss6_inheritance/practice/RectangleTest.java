package ss6_inheritance.practice;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(1, 2);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("Pink", true, 2, 3);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2);
    }
}
