package ss7_abstractclass_interface.bai_tap.interface_resizeable;

import java.util.Arrays;

public abstract class ResizeableTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x);
        shapes[1] = new Rectangle(x, x);
        shapes[2] = new Square(x);

        for (Shape a : shapes) {
            System.out.println(a);
        }

        shapes[0].resize(Math.random() * 100);
        System.out.println(shapes[0].toString());

        shapes[1].resize(Math.random() * 100);
        System.out.println(shapes[1].toString());

        shapes[2].resize(Math.random() * 100);
        System.out.println(shapes[2].toString());


    }
}
