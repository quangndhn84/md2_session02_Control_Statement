package ra.excercise;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        /*
         * Input: name
         * Output: name
         * */
        /*
         * Process:
         * B1: Nhap ten
         *   - Scanner
         *   - Thong bao nhap
         *   - Su sung nextLine() de lay thong tin nhap va luu vao bien
         * B2: Hien thi xin chao
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn:");
        String name = scanner.nextLine();
        System.out.println("Xin chào " + name);
        System.err.println("Chương trình đang gặp lỗi");
    }
}
