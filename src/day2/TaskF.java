package day2;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        char[] answers = new char[length];

        for (int i = 0; i < length; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a + b == c) {
                answers[i] = '+';
            } else if (a - b == c) {
                answers[i] = '-';
            }
        }

        for (char ch :
                answers) {
            System.out.println(ch);
        }
    }
}
