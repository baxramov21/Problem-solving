package acmp.two_sized_arrays;

import java.util.Scanner;

public class Transportation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= 0; j--) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
