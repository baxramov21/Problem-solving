package acmp;

import java.util.Scanner;

public class GCDMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GCM.gcm(scanner.nextInt(), scanner.nextInt()));
    }

}

/*
Даны два натуральных числа A и B. Требуется найти их наибольший общий делитель (НОД).
 */

class GCD {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

/*
Требуется написать программу, определяющую наименьшее общее кратное (НОК) чисел a и b.
 */
class GCM {
    static int gcm(int a, int b) {
        return (a * b) / GCD.gcd(a, b);
    }
}
