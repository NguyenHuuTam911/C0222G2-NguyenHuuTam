package bai_tap_lam_them_oop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Transport {
    protected String bienKiemSoat;
    private HangSanXuat hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public Transport() {
    }

    public Transport(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }


    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BKS : ");
        this.bienKiemSoat = sc.nextLine();

        this.hangSanXuat = this.hangSX();

        System.out.println("Enter the year: ");
        this.namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the tên chủ : ");
        this.chuSoHuu = sc.nextLine();
    }

    public HangSanXuat hangSX() {
        Scanner sc = new Scanner(System.in);
        List<HangSanXuat> hangSXList = new ArrayList<>();
        hangSXList.add(new HangSanXuat(1, "Vinfast", "Việt Nam"));
        hangSXList.add(new HangSanXuat(4, "Trung", "China"));
        hangSXList.add(new HangSanXuat(6, "Toyota", "Japan"));

        System.out.println("CHOICE HangSX :" + "\n" +
                "1.make in Vietnamess" + "\n" +

                "2.make in China" + "\n" +
                "3.make in Japan" + "\n" );

        int choice;
        do {
            for (int i = 0; i < hangSXList.size(); i++) {
                System.out.println((i + 1) + ": " + hangSXList.get(i).getName());
            }
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            if (choice > 0 && choice < hangSXList.size()) {
                return hangSXList.get(choice - 1);
            } else {
                System.out.println(" see you again ");
            }
        } while (true);
    }

    @Override
    public String toString() {
        return " bienKiemSoat: " + bienKiemSoat + '\'' +
                ", hangSanXuat: " + hangSanXuat + '\'' +
                ", namSanXuat: " + namSanXuat + '\'' +
                ", chuSoHuu: " + chuSoHuu;
    }
}
