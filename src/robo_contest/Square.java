package robo_contest;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = "";
        boolean isSquare = false;
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if (i * i == number) {
                isSquare = true;
            }
        }
        if (isSquare) {
            value = "Yes";
        } else {
            value = "No";
        }
        System.out.println(value);
    }
}

/*
Вам дано натуральное число N. Напишите программу, которая проверяет, является ли n квадратом числа
 */

class SquareFix {
    static boolean square(int number) {
        boolean square = false;
        for (int i = 0; i < number; i++) {
            if (i * i == number) {
                square = true;
            }
        }
        return square;
    }
}
