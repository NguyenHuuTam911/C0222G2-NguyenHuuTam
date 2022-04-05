package ss3_array.bai_tap;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrayN = new int[6];
        for(int i = 0;i<arrayN.length;i++){
            System.out.println("Enter element "+(i+1)+" arrayN: ");
            arrayN[i] = scanner.nextInt();
        }
        int min = arrayN[0];
        for(int j=1;j<arrayN.length;j++){
            if(arrayN[j]<min){
                min = arrayN[j];
            }
        }
        System.out.println(min);
    }
}
