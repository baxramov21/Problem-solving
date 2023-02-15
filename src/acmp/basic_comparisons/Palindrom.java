package acmp.basic_comparisons;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = "NO";
        boolean fixed = PalindromSolution.isTheSame(scanner.nextInt());
        if (fixed) {
            value = "YES";
        }
        System.out.println(value);
    }
}

/**
 * Требуется написать программу, определяющую, является ли четырехзначное натуральное
 * число N палиндромом, т.е. числом, которое одинаково читается слева направо и справа налево.
 */

class PalindromSolution {
    static boolean isTheSame(int number) {
       char[] args =  String.valueOf(number).toCharArray();
        return charToInt(args[0]) ==charToInt(args[3])
                && charToInt(args[1]) == charToInt(args[2]);
    }

    static int charToInt(char raw) {
        return Character.getNumericValue(raw);
    }
}
