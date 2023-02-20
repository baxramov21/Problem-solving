package acmp.maths;

import java.util.Scanner;

public class ChangePositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean areTheyEqual = ChangeNumberPositions.areTheyEqual(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        String value = "NO";
        if (areTheyEqual) {
            value = "YES";
        }
        System.out.println(value);
    }
}

/**
 * Всем известно, что «от перестановки слагаемых сумма не изменяется». Однако, случается и так, что перестановка
 * двух чисел приводит к более интересным последствиям.
 *
 * Пусть, например, заданы три числа: a1, a2, a3. Рассмотрим равенство a1+ a2= a3. Оно может быть
 * неверным (например, если a1= 1, a2= 4, a3= 3), однако может стать верным, если поменять некоторые
 * числа местами (например, если поменять местами a2 и a3, оно обратится в равенство 1 + 3 = 4).
 *
 * Ваша задача – по заданным трем числам определить: можно ли их переставить так,
 * чтобы сумма первых двух равнялась третьему.
 */

class ChangeNumberPositions {
    static boolean areTheyEqual(int n1, int n2, int n3) {
        if (n1 + n2 == n3 || n1 + n3 == n2 || n2 + n3 == n1) {
            return true;
        }
        return false;
    }
}
