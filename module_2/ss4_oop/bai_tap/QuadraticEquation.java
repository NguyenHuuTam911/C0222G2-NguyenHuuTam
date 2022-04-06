package ss4_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c, delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return this.a = a;

    }

    public double getB() {
        return this.b = b;
    }

    public double getC() {
        return this.c = c;
    }


    public double getDiscriminant() {

        return delta = (b * b) - (4 * a * c);
    }
    public double getRoot(){
        return -b/(2*a);
    }

    public double getRoot1() {
        return (-b + Math.pow(delta, 0.5)) / (2 * a);

    }

    public double getRoot2() {
        return (-b - Math.pow(delta, 0.5)) / (2 * a);

    }


}


