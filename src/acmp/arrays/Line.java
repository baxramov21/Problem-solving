package acmp.arrays;

import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int height = scanner.nextInt();

        int result = 0;
        if (height == array[array.length - 1] ||
                height < array[array.length - 1]) {
            System.out.println(array.length + 1);
            return;
        }
        for (int i = 0; i < length; i++) {
            if (height > array[i]) {
                result = i + 1;
                System.out.println(result);
                return;
            } else if (array[i] == height) {
                result = i + 2;
            }
        }
        System.out.println(result);
    }
}
