package ss7_abstractclass_interface.thuc_hanh.class_animal_interface_edible;

import ss7_abstractclass_interface.thuc_hanh.fruit.Apple;
import ss7_abstractclass_interface.thuc_hanh.fruit.Fruit;
import ss7_abstractclass_interface.thuc_hanh.fruit.Orange;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
