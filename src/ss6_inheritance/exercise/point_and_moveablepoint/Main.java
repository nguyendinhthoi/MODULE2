package ss6_inheritance.exercise.point_and_moveablepoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2, 3, 4, 5);
        System.out.println(moveablePoint + "\n" + moveablePoint.move());
    }
}
