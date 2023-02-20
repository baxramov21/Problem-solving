package acmp.maths;

import java.util.Scanner;

public class TwoBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = TwoBoxesSolution.invoke(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(value);
    }
}

/**
 * На столе лежат коробка размера A1 × B1 × C1 и коробка размера A2 × B2 × C2. Выясните можно ли одну из этих коробок
 * положить в другую, если разрешены повороты коробок вокруг любого ребра на угол 90 градусов.
 *
 * Входные данные
 * Первая строка входного файла содержит три целых числа A1, B1 и C1. Вторая строка входного файла содержит
 * три целых числа A2, B2 и C2. Все числа положительны и не превосходят 1000.
 *
 * Выходные данные
 * Если коробки одинаковы, выведите "Boxes are equal". Если первая коробка может быть положена во вторую,
 * выведите "The first box is smaller than the second one". Если вторая коробка может быть положена в первую,
 * выведите "The first box is larger than the second one". Иначе, выведите "Boxes are incomparable".
 */

class TwoBoxesSolution {
    static String invoke(int a1, int b1, int c1, int a2, int b2, int c2) {
        int[] swappedNumbers = swap(a1, b1, c1, a2, b2, c2);
        if (swappedNumbers[0] == swappedNumbers[3] && swappedNumbers[1] == swappedNumbers[4] && swappedNumbers[2] == swappedNumbers[5]) {
            return "Boxes are equal";
        } else if (swappedNumbers[0] >= swappedNumbers[3] && swappedNumbers[1] >= swappedNumbers[4] && swappedNumbers[2] >= swappedNumbers[5]) {
            return "The first box is larger than the second one";
        } else if (swappedNumbers[0] <= swappedNumbers[3] && swappedNumbers[1] <= swappedNumbers[4] && swappedNumbers[2] <= swappedNumbers[5]) {
            return "The first box is smaller than the second one";
        } else {
            return "Boxes are incomparable";
        }

    }

    static int[] swap(int a1, int b1, int c1, int a2, int b2, int c2) {
        int[] result = new int[6];

        if (a1 < b1) {
            int t = b1;
            b1 = a1;
            a1 = t;
        }

        if (a1 < c1) {
            int t = c1;
            c1 = a1;
            a1 = t;
        }

        if (b1 < c1) {
            int t = b1;
            b1 = c1;
            c1 = t;
        }


        // yoqaa

        if (a2 < b2) {
            int t = b2;
            b2 = a2;
            a2 = t;
        }

        if (a2 < c2) {
            int t = c2;
            c2 = a2;
            a2 = t;
        }

        if (b2 < c2) {
            int t = b2;
            b2 = c2;
            c2 = t;
        }

        result[0] = a1;
        result[1] = b1;
        result[2] = c1;
        result[3] = a2;
        result[4] = b2;
        result[5] = c2;
        return result;
    }
}