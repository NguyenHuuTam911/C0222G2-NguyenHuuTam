package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AdElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayN = {10, 4, 6, 7, 8, 0,0,0,0 ,0 };
        System.out.print("Enter a numbers x: ");
        int x = scanner.nextInt();
        System.out.print("Enter a numbers index: ");
        int index = scanner.nextInt();
        if (index <= -1 || index >= arrayN.length) {
            System.out.print("Không chèn được phần tử vào mảng");
        } else {

            for (int i = arrayN.length-1; i >index; i--) {
                arrayN[i]=arrayN[i-1];

            } arrayN[index]=x;
        }
        System.out.println(Arrays.toString(arrayN));


    }
}
