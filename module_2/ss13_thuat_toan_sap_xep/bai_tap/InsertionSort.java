package ss13_thuat_toan_sap_xep.bai_tap;

public class InsertionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void insertionSort(double[] list){
        int pos, x;
        for(int i = 1; i < list.length; i++){ //đoạn array[0] đã sắp xếp
            x = (int) list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for(int i=0;i< list.length;i++){
            System.out.println(list[i]+"  ");
        }
    }
}
