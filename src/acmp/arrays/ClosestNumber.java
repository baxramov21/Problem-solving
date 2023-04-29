package acmp.arrays;

import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];


        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        int margin = Math.abs(number - array[0]);
        int result = 0;
        for (int i = 0; i < length; i++) {
            int tempMargin = Math.abs(number - array[i]);
            if (tempMargin <= margin) {
                margin = tempMargin;
                result = array[i];
            }
        }
        System.out.println(result);

    }
}
