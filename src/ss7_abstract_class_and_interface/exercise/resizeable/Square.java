package ss7_abstract_class_and_interface.exercise.resizeable;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, "red", true);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getAreaWithPercent(double percent) {
        return Math.pow((percent * getSide()) / 100, 2);
    }

    public double getArea() {
        return Math.pow(getSide(), 2);
    }


    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" +
                getSide() + ", area= " + getArea() +
                ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
        System.out.println("The Area after resize of Square is " + (getArea() + getAreaWithPercent(percent)));
    }
}
