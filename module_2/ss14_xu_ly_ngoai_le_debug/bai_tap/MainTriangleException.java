package ss14_xu_ly_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class MainTriangleException {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TriangleException triangleException = new TriangleException();
        System.out.println("nhập vào cạnh a của tam giác: ");
        triangleException.a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào cạnh b của tam giác: ");
        triangleException.b = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào cạnh c của tam giác: ");
        triangleException.c = Integer.parseInt(scanner.nextLine());
          triangleException.triangle(triangleException.a, triangleException.b, triangleException.c);

        System.out.println(triangleException);
    }
}
