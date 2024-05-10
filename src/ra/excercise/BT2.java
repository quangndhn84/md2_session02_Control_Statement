package ra.excercise;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        /*
         * Input: usd, RATE
         * Output: vnd
         * */
        /*
         * Process:
         * B1: Khai báo hằng số RATE
         * B2: Nhập usd
         *   - Scanner
         *   - Thông báo nhập
         *   - usd = Float.parseFloat(scanner.nextLine())
         * B3: Tính vnd: vnd = usd*RATE
         * B4: In ra vnd
         * */
        //B1
        final float RATE = 24000;
        //B2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào usd:");
        float usd = Float.parseFloat(scanner.nextLine());
        //B3
        float vnd = usd * RATE;
        //B4
        System.out.printf("%.2f usd tương đương %.3f vnd\n", usd, vnd);
    }
}
