package acmp.arrays;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int subArraysAmount = scanner.nextInt();

        for (int i = 0; i < subArraysAmount; i++) {
            System.out.println();
            int startIndex = scanner.nextInt();
            int endIndex = scanner.nextInt();
            for (int j = startIndex-1; j < endIndex; j++) {
                System.out.print(array[j]+" ");
            }
        }
    }
}
