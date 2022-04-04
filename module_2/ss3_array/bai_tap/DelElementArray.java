package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DelElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayN = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Enter a element delete:");
        int x = scanner.nextInt();
        int indexDel = 0;
        for (int i = 0; i < arrayN.length; i++) {
            if (x == arrayN[i]) {
                indexDel = i;


            }
        }

        for (int i = indexDel; i < arrayN.length - 1; i++) {
            arrayN[i]=arrayN[i+1];

        }
        System.out.println(Arrays.toString(arrayN));

    }
}
