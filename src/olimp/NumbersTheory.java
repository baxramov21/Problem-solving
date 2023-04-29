package olimp;

import java.util.Scanner;

public class NumbersTheory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        for (int i = 2; (long) i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
