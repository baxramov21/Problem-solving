package day2;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();

        double result = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            System.out.println(-1);
        } else if ((x1 == x2 && y1 == y2) || (r1 + r2 < result) || (result + Math.min(r1, r2) < Math.max(r1, r2))) {
            System.out.println(0);
        } else if ((r1 + r2 == result) || (result + Math.min(r1, r2) == Math.max(r1, r2))) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

    }
}
