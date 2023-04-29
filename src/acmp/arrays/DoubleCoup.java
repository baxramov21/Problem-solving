package acmp.arrays;

import java.util.Scanner;

public class DoubleCoup {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int border = scanner.nextInt();
        int startA = scanner.nextInt();
        int endB = scanner.nextInt();
        int startC = scanner.nextInt();
        int endD = scanner.nextInt();

        int[] result = new int[border];
        int[] numbers = new int[border];
        for (int i = 1; i < border; i++) {
            numbers[i - 1] = i;
        }
        int j = 0;
        for (int i = endB - 1; i >= startA; i--) {
            result[j] = numbers[i];
            j++;
        }

        int l = 0;
        for (int i = endD - 1; i >= startC; i--) {
            result[l] = numbers[i];
            l++;
        }

        for (int element : result) {
            System.out.println(element);
        }
    }
}
