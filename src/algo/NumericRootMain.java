package algo;

import java.util.Scanner;

public class NumericRootMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(NumericRoot.numericRoot(NumericRoot2.invoke(numbers)));
    }
}

/*
Даны два натуральных числа a и b. Напишите программу, которая находит цифровые корни каждого из них.
 При вычислении цифрового корня мы складываем цифры числа. Если это не однозначное число,
 мы продолжаем этот процесс, пока оно не станет однозначным числом.
 */


class NumericRoot {
    static int numericRoot(long a) {
        char[] numbers = String.valueOf(a).toCharArray();
        if (numbers.length == 1) {
            return Character.getNumericValue(numbers[0]);
        }
        long value = 0;
        for (int i = 0; i < numbers.length; i++) {
            value = value + Character.getNumericValue(numbers[i]);
        }
        return numericRoot(value);
    }
}



/*

Given an array of one-dimensional integers. The number of array elements is n. Write a program that finds
the numerical root of the following expression.

input: 5
input: 5,6,1
output: 2


5 + (5 * 6) + (5 * 6 * 1)
 */

class NumericRoot2 {
    static long invoke(int[] args) {
        long value1 = 0;

        for (int i = 0; i < args.length; i++) {
            long proizved = 1;
            for (int j = 0; j <= i; j++) {
                proizved *= args[j];
            }
            value1 += proizved;
        }
        return value1;
    }
}
