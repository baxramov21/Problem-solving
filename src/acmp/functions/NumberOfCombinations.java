package acmp.functions;

import java.util.Scanner;

public class NumberOfCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long nFK = factorial(n);
        long kFK = factorial(k);
        long result;


        result = nFK / (kFK * (factorial(n - k)));
        System.out.println(result);
    }

    static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
