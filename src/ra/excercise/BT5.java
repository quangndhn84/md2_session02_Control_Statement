package ra.excercise;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        /*
         * Input: radius
         * Process:
         *   B1: Hằng số PI
         *   B2: nhập radius
         *   B3: Tính chu vi
         *   B4: Tính diên tích
         *   B5: In chu vi và diện tích
         * Output: perimeter, area
         * */
        //B1:
        final float PI = 3.14F;
        //B2:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn:");
        float radius = Float.parseFloat(scanner.nextLine());
        //B3:
        float perimeter = 2 * radius * PI;
        //B4:
        float area = PI * radius * radius;
        //B5:
        System.out.printf("Chu vi: %f - Diện tích: %f\n", perimeter, area);
    }
}
