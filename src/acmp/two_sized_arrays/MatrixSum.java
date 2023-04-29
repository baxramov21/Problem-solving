package acmp.two_sized_arrays;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a1[i][j] = sc.nextInt();
            }
        }

        int[][] a2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a2[i][j] = sc.nextInt();
            }
        }

        int[][] matrixSum = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixSum[i][j] = a1[i][j] + a2[i][j] ;
            }
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
