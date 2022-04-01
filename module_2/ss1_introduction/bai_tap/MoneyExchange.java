package ss1_introduction.bai_tap;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        int usd;
        int vnd;
        System.out.println("Enter USD");
        usd = scanner.nextInt();
        vnd = usd * 23000;
        System.out.println("Tỉ Giá Chuyển đổi giữa " +usd+ " USD thành VNĐ là = " +vnd+ " VNĐ");


    }
}
