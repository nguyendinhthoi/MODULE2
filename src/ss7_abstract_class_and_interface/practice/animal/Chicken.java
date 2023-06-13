package ss7_abstract_class_and_interface.practice.animal;


import ss7_abstract_class_and_interface.practice.edible.Edible;

public class Chicken extends Animal implements Edible {


    @Override
    public String makeSound() {
        return "Cuktak Cuktak";
    }

    @Override
    public void howToEat() {
        System.out.println("Can be Fried");
    }
}
