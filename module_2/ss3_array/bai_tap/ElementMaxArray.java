package ss3_array.bai_tap;

import java.util.Scanner;

public class ElementMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] arrayN = {{5, 6, 7, 8}, {3, 5, 7, 9}};
        float max = arrayN[0][0];
        int a = 0;
        int b = 0;
        for (int i = 0; i < arrayN.length; i++) {
            for (int j = 0; j < arrayN[i].length; j++) {
                if (arrayN[i][j] > max) {
                    max = arrayN[i][j];
                    a = i;
                    b = j;

                }
            }
        }
        System.out.println("max=" + max + " index i=" + a + " index j=" +b+ "\n");
        float[][] arrayM = new float[3][2];
        for (int i = 0; i < arrayM.length; i++) {
            for (int j = 0; j < arrayM[i].length; j++) {
                System.out.println("Nhập phần tử thứ " + i + "-" + j);
                arrayM[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        float maxM = 0;
        for (int i = 0; i < arrayM.length; i++) {
            for (int j = 0; j < arrayM[i].length; j++) {
                if (arrayM[i][j] > maxM) {
                    maxM = arrayM[i][j];
                }
            }
        }
        System.out.println(maxM);

    }
    public static float findMax(float[][]array){
        float max = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];


                }
            }
        }
        return max;


    }


}

