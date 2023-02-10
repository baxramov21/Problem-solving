package algo;

import java.util.Scanner;

public class NumericRootMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = NumericRoot.numericRoot(scanner.nextLong());
        int secondNumber = NumericRoot.numericRoot(scanner.nextLong());
        System.out.println(firstNumber + " " + secondNumber);
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
