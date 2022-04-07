package ss5_accessmodifier_static.thuc_hanh;

public class MainCar {
    public static void main(String[] args) {

        ClassCar car1 = new ClassCar("Mazda 3", "Skyactiv 3");

        System.out.println(ClassCar.numberOfCars);

        ClassCar car2 = new ClassCar("Mazda 6", "Skyactiv 6");

        System.out.println(ClassCar.numberOfCars);

    }
}
