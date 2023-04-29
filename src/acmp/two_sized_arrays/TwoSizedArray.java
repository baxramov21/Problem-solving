package acmp.two_sized_arrays;

import java.util.Scanner;

public class TwoSizedArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][] a = new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<n; i++){
                long s=0;
                for(int j=0; j<m; j++){
                    s+=a[i][j];
                }
                System.out.print(s+" ");
            }
            System.out.println();
            for(int i=0; i<m; i++){
                long s=0;
                for(int j=0; j<n; j++){
                    s+=a[j][i];
                }
                System.out.print(s+" ");
            }
            System.out.println();
            System.out.println();
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
}
