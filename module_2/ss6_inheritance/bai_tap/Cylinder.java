package ss6_inheritance.bai_tap;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return getRadius()*height*Math.PI;

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height= " + height +
                " which is a subclass of "
                + super.toString();

    }
}
