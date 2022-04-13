package ss7_abstractclass_interface.bai_tap.interface_resizeable;

public class Square extends Shape implements Resizeable {
    private double squareEdge = 1.0;

    public Square() {

    }

    public Square(double squareEdge) {
        this.squareEdge = squareEdge;
    }

    public Square(double squareEdge, String color, boolean filled) {
        super(color, filled);
        this.squareEdge = squareEdge;
    }

    public double getSquareEdge() {
        return squareEdge;
    }

    public double setSquareEdge(double squareEdge) {
        this.squareEdge = squareEdge;
        return squareEdge;
    }

    public double getArea() {
        return squareEdge * squareEdge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareEdge=" + squareEdge +
                " which is a subclass of"
                + super.toString();

    }

    @Override
    public void resize(double percent) {
        this.squareEdge +=percent;
        return;

    }
}
