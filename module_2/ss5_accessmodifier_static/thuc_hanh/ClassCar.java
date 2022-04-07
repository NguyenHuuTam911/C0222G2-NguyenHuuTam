package ss5_accessmodifier_static.thuc_hanh;

public class ClassCar {
    private String name;

    private String engine;


    public static int numberOfCars;


    public ClassCar(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }
}
