package day2;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] answers = new int[length];

        for (int i = 0; i < length; i++) {
            String statement = scanner.next();
            char[] array = statement.toCharArray();

            int a = Character.getNumericValue(array[0]);
            char c = array[1];
            int b = Character.getNumericValue(array[2]);

            if (c == '+') {
                answers[i] = a + b;
            } else {
                answers[i] = a - b;
            }
        }

        for (int ch : answers) {
            System.out.println(ch);
        }
    }
}
