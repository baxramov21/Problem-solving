package day2;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        boolean[] answers = new boolean[length];

        for (int i = 0; i < length; i++) {
            int a = 2;
            int c = scanner.nextInt();
            int b = scanner.nextInt();

            int d = c - a;


            if (a + b == c || a == c || b == c) {
                answers[i] = true;
            } else if (c - (a + b) % 2 == 0) {
                answers[i] = true;
            } else if ( d % 2 == 0 && b % 2 == 0
                    || d % 2 == 1 && b % 2 == 1) {
                answers[i] = true;
            } else answers[i] = isPower(a + b, c);
        }

        for (boolean b :
                answers) {
            if (b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isPower(int x, int y)
    {
        // The only power of 1 is 1 itself
        if (x == 1)
            return (y == 1);

        // Repeatedly compute power of x
        int pow = 1;
        while (pow < y)
            pow = pow * x;

        // Check if power of x becomes y
        return (pow == y);
    }
}
