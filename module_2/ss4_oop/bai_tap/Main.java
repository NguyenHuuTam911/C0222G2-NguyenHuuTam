package ss4_class_object.bai_tap;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number b: ");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number c: ");
        double c = Integer.parseInt(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Nghiệm của x1 là: " + quadraticEquation.getRoot1() + "và x2: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Co nghiem chung x: " + quadraticEquation.getRoot());

        } else {
            System.out.println("The equation has no roots");
        }


    }
}
