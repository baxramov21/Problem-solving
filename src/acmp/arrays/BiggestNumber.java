package acmp.arrays;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int maxNumber = -1005;
        int index = 0;

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int searchStartIndex = scanner.nextInt();
        int searchEndIndex = scanner.nextInt();

        for (int i = searchStartIndex-1; i < searchEndIndex; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                index = i + 1;
            }
        }
        System.out.println("" + maxNumber + " " + index);

    }
}
