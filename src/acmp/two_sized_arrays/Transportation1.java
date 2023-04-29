package acmp.two_sized_arrays;

import java.util.Scanner;

public class Transportation1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
