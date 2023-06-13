package ss7_abstract_class_and_interface.exercise.colorable;

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
    public void howToClor() {
        super.howToClor();
        System.out.println("Color all four sides");
    }
}
