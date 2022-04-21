package ss14_xu_ly_ngoai_le_debug.bai_tap;

public class TriangleException {
    int a;
    int b;
    int c;

    public void triangle(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("số đo ba cạnh tam giác không hợp lệ");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new Exception("chiều dài 3 cạnh tam giác không hợp lệ");

        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }


    }

}
