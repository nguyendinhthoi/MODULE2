package ss7_abstract_class_and_interface.practice.animal;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals =  new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal value : animals){
            System.out.println(value.makeSound());
        }
    }
}
