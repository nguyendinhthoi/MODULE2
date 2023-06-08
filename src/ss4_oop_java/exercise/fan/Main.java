package ss4_oop_java.exercise.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("Standard :" + fan);

        Fan fan1 = new Fan(fan.fast, true, 10, "yellow");
        System.out.println("The fan is on \n" + fan1);
        Fan fan2 = new Fan(fan.medium, false, 5, "blue");
        System.out.println("The fan is off \n" + fan2);
    }
}
