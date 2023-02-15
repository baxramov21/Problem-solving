package acmp.basic_comparisons;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = "NO";
        boolean fixed = ArithmeticsSolution.fix(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        if (fixed) {
            value = "YES";
        }
        System.out.println(value);
    }
}

/**
 * В выходной файл нужно вывести YES в том случае, если A*B=C и вывести NO в противном случае.
 */

class ArithmeticsSolution {
    static boolean fix(int n1, int n2, int n3) {
        return n1 * n2 == n3;
    }
}
