package acmp.arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int count = 0;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int requiredNumber = scanner.nextInt();

        for (int number :
                array) {
            if (number == requiredNumber) {
                count++;
            }
        }
        System.out.println(count);
    }
}
