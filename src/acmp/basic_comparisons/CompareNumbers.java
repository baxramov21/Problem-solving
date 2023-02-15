package acmp.basic_comparisons;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CompareFix.compare(scanner.nextInt(),scanner.nextInt()));
    }
}

/**
 * Одна из основных операций с числами – их сравнение. Мы подозреваем, что вы в совершенстве владеете этой операцией
 * и можете сравнивать любые числа, в том числе и целые. В данной задаче необходимо сравнить два целых числа.
 *
 * Запишите в выходной файл OUTPUT.TXT один символ "<", если A < B, ">", если A > B и "=", если A=B.
 */

class CompareFix {
    static char compare(int n1, int n2) {
        if (n1 > n2) {
            return '>';
        } else if (n2 > n1) {
            return '<';
        } else {
            return '=';
        }
    }
}
