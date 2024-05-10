package ra.excercise;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        /*
         * Input: side
         * Process:
         *   B1: nhập side
         *   B2: tính chu vi
         *   B3: tính diện tích
         *   B4: In chu vi và diện tích
         * Output: perimeter, area
         * */
        //B1:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh hình vuông:");
        float side = Float.parseFloat(scanner.nextLine());
        //B2:
        float perimeter = side * 4;
        //B3:
        float area = side * side;
        //B4:
        System.out.printf("Hình vuông có cạnh %f có chu vi: %f - Diện tích: %f\n", side, perimeter, area);
    }
}
