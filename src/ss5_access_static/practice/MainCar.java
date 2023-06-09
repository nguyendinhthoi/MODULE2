package ss5_access_static.practice;

public class MainCar {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        car1.display();
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        car2.display();
        System.out.println(Car.numberOfCars);
    }
}
