package ss6_inheritance.practice;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square(1);
        System.out.println(square1);
        Square square2 = new Square("Brown", false, 2);
        System.out.println(square2);
    }
}
