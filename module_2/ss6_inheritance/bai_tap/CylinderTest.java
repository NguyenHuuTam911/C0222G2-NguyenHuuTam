package ss6_inheritance.bai_tap;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5,"green",1.2);
        System.out.println(cylinder);
        System.out.println("Volume of Cylinder: "+cylinder.getVolume());

    }
}
