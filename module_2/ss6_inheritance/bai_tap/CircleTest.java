package ss6_inheritance.bai_tap;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5,"Red");
        System.out.println(circle);
        System.out.println("Area of Circle: "+circle.getArea());
    }
}
