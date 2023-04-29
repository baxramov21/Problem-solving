package acmp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Harvesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int length = scanner.nextInt();
        int[] array = new int[length];


        for (int i = 0; i < args.length; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        sum = array[length - 3] + array[ length - 2] + array[length - 1];
        System.out.println(sum);
    }
}
