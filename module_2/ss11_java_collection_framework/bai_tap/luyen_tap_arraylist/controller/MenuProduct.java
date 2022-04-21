package ss11_java_collection_framework.bai_tap.luyen_tap_arraylist.controller;

import bt_lam_them.ProductManager;

import java.util.Scanner;

public class MenuProduct {
    public void menuProduct(){
        ProductManager productManager = new ProductManager();
        Scanner scanner =  new Scanner(System.in);

        boolean flag=true;
        do {
            System.out.print( "\n1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần theo giá\n" +
                    "7. Sắp xếp sản phẩm giảm dần theo giá\n" +
                    "8. Thoát\n" +
                    "Nhập lựa chọn: ");
            int choice=Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.display();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    System.out.println("sắp xếp");
                    productManager.sortUpAscending();
                    break;
                    case 7:
                    flag=false;
                    System.out.println("Chương trình đã thoát");
                    break;


            }
        }while (flag);
    }
}
