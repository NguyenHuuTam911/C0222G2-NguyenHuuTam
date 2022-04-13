package ss7_abstractclass_interface.bai_tap.interface_colorable;

public abstract class ColorableTest {
    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println("Area Square: " + square.getArea());
        square.howToColor();

    }


}
