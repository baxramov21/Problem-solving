package acmp;

import java.util.Scanner;

public class GCDMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(gcm(scanner.nextInt(), scanner.nextInt()));
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int gcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
