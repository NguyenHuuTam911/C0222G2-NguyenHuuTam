package ss7_abstractclass_interface.thuc_hanh.class_animal_interface_edible;

import ss7_abstractclass_interface.thuc_hanh.edible.Edible;


public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
