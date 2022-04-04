package ss2_loop.bai_tap;

import java.util.Scanner;

public class PrintMenu {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {

            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 6; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;

            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;

            case 3:
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");

                    }
                    System.out.print("\n");

                }
                break;
            case 0 :
                System.exit(0);
            default:
                System.out.println("No Choice!");

        }

    }
}
