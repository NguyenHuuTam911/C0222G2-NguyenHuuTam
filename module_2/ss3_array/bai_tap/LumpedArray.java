package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayN = new int[5];
        int[] arrayM = new int[6];
        int[] array3 = new int[arrayN.length + arrayM.length];
        for (int i = 0; i < arrayN.length; i++) {
            System.out.print("Enter element arrayN: ");
            arrayN[i] = scanner.nextInt();
        }
        for (int j = 0; j < arrayM.length; j++) {
            System.out.print("Enter element arrayM: ");
            arrayM[j] = scanner.nextInt();
        }
        for (int i = 0; i < arrayN.length; i++) {
            array3[i] = arrayN[i];
        }
        for (int j = 0; j < arrayM.length; j++) {
            array3[j + arrayN.length] = arrayM[j];
        }
        System.out.print(Arrays.toString(array3));

    }
}
